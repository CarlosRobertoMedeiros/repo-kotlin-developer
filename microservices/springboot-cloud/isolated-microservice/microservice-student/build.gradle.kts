import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.1.11"
	id("io.spring.dependency-management") version "1.1.4"
//	id("io.gitlab.arturbosch.detekt") version "1.22.0" //detekt
//	id("org.jlleitschuh.gradle.ktlint") version "11.5.0" //ktlint
	id("org.openapi.generator") version "7.5.0" //openapi-pluggin
	id("io.freefair.lombok") version "8.1.0" //lombok-para-openapi
	kotlin("jvm") version "1.8.22"
	kotlin("plugin.spring") version "1.8.22"
	jacoco
}

group = "br.com.roberto"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

springBoot {
	buildInfo() // Configuração do plugin build-info
}

dependencies {
	//spring
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-data-mongodb")

	//kotlin
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")

	//Util
//	detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.22.0")

	//openapi
	implementation("org.openapitools:openapi-generator-gradle-plugin:7.5.0")

	//swagger-ui
	implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.5.0")

	//Observability
	implementation("io.micrometer:micrometer-core")
	implementation("io.micrometer:micrometer-registry-prometheus")
	implementation("org.springframework.boot:spring-boot-starter-aop")
	implementation("org.aspectj:aspectjweaver")

	//Unit Test
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

val genratedSoucesPath = "$buildDir/generated"

fun loadEnvVars(test: Test, envPath:String){
	file(envPath).readLines().forEach {
		val envVar = it.split("=")
		if (envVar.size > 1){
			test.environment(envVar[0], envVar[1])
		}
	}
}

openApiGenerate {
	generatorName.set("kotlin-spring")
	outputDir.set(genratedSoucesPath)
	invokerPackage.set("br.com.roberto.microservice_student")
	inputSpec.set("$rootDir/src/main/resources/api-specification/openapi.yaml")
	configFile.set("$rootDir/src/main/resources/api-specification/config/config.json")
}
kotlin.sourceSets["main"].kotlin.srcDir("$genratedSoucesPath/src/main/kotlin")

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs += "-Xjsr305=strict"
		jvmTarget = "17"
	}
}
tasks.withType<KotlinCompile>().configureEach {
	dependsOn("openApiGenerate")
}

val converageExcludePatchs: List<String> by extra {
	listOf(
		"br/com/roberto/microservice_student/application/**"
	)
}

jacoco {
	toolVersion="0.8.9"
}

tasks.withType<JacocoReport> {
	classDirectories.setFrom(
		sourceSets.main.get().output.asFileTree.matching {
			exclude(converageExcludePatchs)
		}
	)
}

tasks.withType<JacocoCoverageVerification> {
	classDirectories.setFrom(
		sourceSets.main.get().output.asFileTree.matching {
			exclude(converageExcludePatchs)
		}
	)
}

tasks.jacocoTestReport{
	dependsOn(tasks.test)
	reports {
		xml.required.set(true)
		csv.required.set(true)
	}
}

tasks.jacocoTestCoverageVerification {
	dependsOn(tasks.test, tasks.jacocoTestReport)
	violationRules {
		rule {
			limit {
				minimum = "0.0".toBigDecimal()
				counter = "LINE"
			}
			limit {
				minimum = "0.0".toBigDecimal()
				counter = "BRANCH"
			}
		}
	}
	executionData(
		file("${project.layout.buildDirectory}/jacoco/test.exec")
	)
	mustRunAfter(tasks.jacocoTestReport)
}

//tasks.check{
//	dependsOn("detekt","ktlintCheck")
//}
tasks.test{
	loadEnvVars(this,"variables-test.env")
	useJUnitPlatform()
	finalizedBy(tasks.jacocoTestReport,tasks.jacocoTestCoverageVerification)
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.bootBuildImage {
	builder.set("paketobuildpacks/builder-jammy-base:latest")
}

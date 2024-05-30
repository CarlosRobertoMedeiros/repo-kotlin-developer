~~~~# Kotlin Developer
![Kotlin](https://img.shields.io/badge/kotlin-%237F52FF.svg?style=for-the-badge&logo=kotlin&logoColor=white)
![Spring](https://img.shields.io/badge/springboot-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white)

# Welcome to `service-student`

## 🚨 Responsabilities & Functionalities
    This service is responsible for creating and retrieving an existent student.

---

## 👨‍🎨 Service Draw Flow
    Here is the image that show the specific definition of this service.

---

## 🖥️ Framework
    Made with Kotlin with Spring Boot and Gradle

---

## ✅ Requirements stack
- [Docker desktop](https://www.docker.com/products/docker-desktop/)    
- [Localstack](https://www.localstack.cloud/)

---
## ✅ Requirements dev
- [Java OpenJDK 17.0.6](https://www.openlogic.com/openjdk-downloads)
- [Gradle v8.7](https://gradle.org/releases/)
- [Spring Boot 3.1.11](https://start.spring.io/)
- [IDE - Intelij 2023.2](https://www.jetbrains.com/idea/download/)

---

## 📊 Sonar
- [Quality Gate Status](a fazer)
- [Coverage](a fazer)
- [Maintainability Raiting](a fazer)
- [Technical Debt](a fazer)
- [Code Smell](a fazer)

---

## 📚 Collection - Postman
    Inside the folder `/collection` is the collection with all endpoints of this service

    It´s necessary to have a global variable named `environment`, that must be defined with values `dev` or `hml`
    The others variables are already inside the collection itself

---

## 🔐 Environment variables
    The default environment variables are in [application.yml](src/main/resources/application.yml)
    Don´t forget to change the `profile` to have the correct connection
    
    On Intelij you can use [envfile plugin] to help on IDE configurations

| Variable         | Description             | Format                       | Example         |
|------------------|-------------------------|------------------------------|-----------------|
| SERVICE_NAME     | service name            | [a-z0-9-]+                   | service-student |
| SERVER_PORT      | service port            | [0-9]+                       | 8031            | 
| ENVIRONMENT_NAME | environment description | `local`,`dev`,`hml` or `prd` | local           |

---
## 🐳 Local Dependencies
In the run:
```sh
    # run to up a dependencies containers
    docker-compose -f ./docker/coker-compose.yml up
```

---
## 🧪 Unit Tests
```sh
    # execute gradle test
    ./gradlew test
```  

---
## 📊 Generate jacoco test report
```sh
    # execute gradle jacoco report
    ./gradlew jacocoTestReport
``` 

---
## 📊 Generate jacoco test after coverage
```sh
    # execute Jacoco Test after coverage
    ./gradlew jacocoTestCoverageVerification
```  

---
## 📘 Project openapi 
	http://localhost:8031/service-student/swagger-ui/index.html

---
## 📘 Apidocs
	http://localhost:8031/service-student/api-docs

---
## 🚑 Health check
	http://localhost:8031/service-student/actuator
    http://localhost:8031/service-student/health

---
## ✔️ Health check info
	http://localhost:8031/service-student/actuator/info

---
## 📣 JMetter for stress test
     url JMetter file

---
## 🔧 Run
```sh
    # execute java outside ide 
    ./java -jar service-student.jar
``` 

---
## 📮 Logs & Metrics
    http://localhost:8031/service-student/actuator/info

#### LogTags
* `STUDENT, CONTROLLER, POST`
* `STUDENT, SERVICE`
* `STUDENT, ADAPTER, POST`
---
#### LogMessages
```
[SUCCESS]
  - [STUDENT_CONTROLLER] Starting Process ...
  - [STUDENT_SERVICE] Starting Process ...
  - [STUDENT_ADAPTER] Starting Process ...
  
[ERROR]
  - [STUDENT_CONTROLLER] Error when ...
  - [STUDENT_SERVICE] Error when ...
  - [STUDENT_ADAPTER] Error when ...
```
---
#### Metrics
```
[INTERNAL]
  - "student_findAll"
  - "student_findById"
  - "student_create"
  - "student_update"
  - "student_delete"
  
[EXTERNAL]
  - "resource_grades_service"
```
---
## 📌 Version
  - In this source code we are using [semver](http://semver.org/) for version control. 
  - For available version see the tags in this repository [tags neste repositório](https://github.com/suas/tags/do/projeto). 

---
## ✒️ Author
* ```Carlos Roberto``` - developer and documenter

---
## ©️ Licence
`This project is under licence` (your licence) - see the file [LICENSE.md](https://github.com/usuario/projeto/licenca) for details.
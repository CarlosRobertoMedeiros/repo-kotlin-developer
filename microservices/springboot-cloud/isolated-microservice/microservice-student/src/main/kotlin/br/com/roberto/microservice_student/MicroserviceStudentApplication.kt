package br.com.roberto.microservice_student

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MicroserviceStudentApplication

fun main(args: Array<String>) {
	runApplication<MicroserviceStudentApplication>(*args)
}

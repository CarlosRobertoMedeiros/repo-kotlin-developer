package br.com.roberto.kotlin.sample_unit_test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SampleUnitTestApplication

fun main(args: Array<String>) {
	runApplication<SampleUnitTestApplication>(*args)
}

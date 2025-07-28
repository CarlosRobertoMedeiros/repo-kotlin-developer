package br.com.roberto.webflux_playground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebfluxPlaygroundApplication

fun main(args: Array<String>) {
	runApplication<WebfluxPlaygroundApplication>(*args)
}

package br.com.roberto.coroutinebasicsexamples.f

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout

/*
* Nesse código, é usada a função withTimeout, que deixa fixo o tempo que uma corotina pode rodar.
* Caso esse tempo passe, é retornado um erro, sendo
*  kotlinx.coroutines.TimeoutCancellationException.
*
* */
fun main() = runBlocking {
    withTimeout(1_300L){
        repeat(1_000) {i ->
            println("I'am Sleeping $i")
            delay(500L)
        }
    }
}
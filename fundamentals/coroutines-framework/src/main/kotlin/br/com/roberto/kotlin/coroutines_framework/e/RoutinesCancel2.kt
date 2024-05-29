package br.com.roberto.coroutinebasicsexamples.e

import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


/**
 *
 * Agora, ao invés de um repeat(1000), temos um while(isActive), isActive é uma variável
 * interna da corotina, que sempre é verdadeira enquanto a corotina não terminou ou não foi
 * cancelada. Logo, quando usamos tarefa.cancel(), a variável isActive se torna falsa e a
 * corotina é cancelada.
 * */
fun main() = runBlocking{
    val task = launch {
        while (isActive){
            println("Task: Running")
            delay(1_000L)
        }
    }
    delay(5_000L)
    println("I don't want more to execute this task")
    task.cancel()
    task.join()
    println("Now I can close")
}
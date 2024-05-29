package br.com.roberto.coroutinebasicsexamples.e

import kotlinx.coroutines.*

/*
 * há o método cancelAndJoin(), que cancela a corotina e espera pelo seu fechamento.
 * Com isso, o nosso código ficará assim:
 *
 * */
fun main() = runBlocking {
    val task = launch {
        try {
            var i = 0
            while (isActive) {
                println("Task: I'm running $i times")
                delay(1_000L)
                i++
            }
        }finally {
            println("Task Finished")
        }
    }
    delay(500)
    println("I don't want more to execute this task")
    task.cancelAndJoin()
    println("Now I can close")
}
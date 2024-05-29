package br.com.roberto.coroutinebasicsexamples.d

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


/*
*
* Mas, e se eu quiser que a corotina tarefa rode junto com o código da função main?
*
*  Podemos fazer isso mudando na linha 22 de tarefa.join() para tarefa.start(),
*  com isso o nosso código ficará assim:
*
*/
fun main() = runBlocking {
    val task = launch {
        delay(1_000L)
        println("World !")
    }
    println("Hello")
    task.start()
    println("End")
}
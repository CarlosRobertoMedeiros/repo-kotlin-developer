package br.com.roberto.coroutinebasicsexamples.b

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 *
 * Agora vamos transformar o conteúdo de dentro do bloco launch em uma função. Para isso, iremos
 * precisar usar um suspend antes da função. (Função de suspensão)
 *
 * Mas, o quê é esse suspend?
 *
 * funções com suspend são funções que podem ser usadas normalmente dentro de corotinas, mas
 * podem usar algumas funções especiais, como a função delay que como foi explicado mais cedo,
 * serve para fazer a corotina esperar um tempo em milisegundos.
 *
 * */

suspend fun writeHelloWorld(){
    delay(1_000)
    println("World")
}

fun main() = runBlocking {
        launch { writeHelloWorld() }
        println("Hello")
}


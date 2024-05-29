package br.com.roberto.coroutinebasicsexamples.c

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


/**
 *  Escopo de Corotinas
 *
 * Podemos também criar um escopo onde iremos armazenar corotinas dentro. Esse escopo se chama
 * coroutineScope. Esse bloco é muito parecido com o bloco runBlocking, mas tem uma diferença,
 * enquanto o runBlocking bloqueia a thread em uso enquanto está esperando algo, o
 * coroutineScope libera a thread para outros usos enquanto espera algo.
 *
 * Como o coroutineScope consegue fazer isso?
 *
 * Porque o coroutineScope é uma função de suspensão, enquanto o runBlocking é uma função normal.
 * Por isso coroutineScope tem essas habilidades especiais.
 *
 * Agora, vamos mudar a função escreverMundo, para fazer que essa função use os poderes de um
 * coroutineScope:
 *
  * */
suspend fun writeWorld() = coroutineScope {
        launch {
            delay(1_000)
            println("World")
        }
        launch {
            delay(4_000)
            println("Already Passed 4 seconds")
        }
        println("Hi")
    }

suspend fun writeWorldExample2() = coroutineScope {
    /**
     * Como a função runBlocking bloqueia a thread enquanto está rodando, primeiro, todas
     * as instruções de escreverMundo são rodadas, e após isso que o código irá continuar,
     * mandando o Olá na tela.
     *
     * Com todos esses recursos, dá pra fazer bastante coisa usando escopos de corotinas
     * com coroutineScope, iniciar partes do código com corotinas com runBlocking, iniciar
     * uma corotina com launch, e fazer uma corotina esperar um tempo com delay.
     *
     * */
    launch {
        delay(1_000)
        println("World")
    }
    launch {
        delay(4_000)
        println("Already Passed 4 seconds")
    }
}

fun main() = runBlocking {
    writeWorld()
    writeWorldExample2()
    println("Hi")
}
package br.com.roberto.coroutinebasicsexamples.d

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


/*
*
*  Jobs ou tarefas são instâncias de corotinas, que podem ser manipuladas para por exemplo,
*  cancelar a corotina, esperar a corotina terminar todo o processamento para que o código
*  principal continue,etc. Vamos ver esse exemplo abaixo:
*
* */
fun main() = runBlocking {
    /**
     * main recebe um bloco runBlocking, podendo assim usar as corotinas dentro;
     * é criada uma variável chamada tarefa que recebe uma corotina em um bloco launch.
     * Com isso, a corotina é iniciada e o código principal continua;
     * Após isso, é escrito na tela um Hi;
     * A função tarefa.join() faz com que a corotina tarefa tenha de terminar para que o
     * código principal continue, com isso a instrução println("Fim") apenas irá rodar depois
     * da corotina tarefa
     * Após isso, a corotina espera um segundo, com a instrução delay(1000L);
     * E ao final da corotina tarefa, é escrito um Mundo! na tela;
     * E depois da corotina tarefa ter acabado, é escrito um Fim na tela.
     * */
    val task = launch {
        delay(1_000)
        println("World")
    }
    println("Hi")
    task.join()
    println("End")

}

//Url: https://dev.to/kotlinautas/basico-de-corotinas-em-kotlin-50a8
package br.com.roberto.coroutinebasicsexamples.f

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

/*
* Nesse código, é usada a função withTimeout, que deixa fixo o tempo que uma corotina pode rodar.
*  Caso esse tempo passe, é retornado um erro, sendo
*  kotlinx.coroutines.TimeoutCancellationException.
*  Caso você queria que esse timeout não resulte em um erro, é possível se se usar a função
*   withTimeoutOrNull, dessa maneira:
* */
fun main() = runBlocking {
    val result = withTimeoutOrNull(1_300L){
        repeat(1000) { i ->
            println("Estou dormindo $i ...")
            //delay(500L)  -> Pode se usar tanto com tempo quanto sem tempo
        }
        "Done"
    }
    println("Result is $result")
}

//Continuar funções suspensas
//https://dev.to/kotlinautas/basico-de-corotinas-em-kotlin-50a8

package br.com.roberto.coroutinebasicsexamples.a

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
/**
 * RunBlocking é um bloco que irá armazenar todas as corotinas de uma parte do código,
 * como se criasse um contexto diferente do normal da main. Todas as corotinas devem estar
 * dentro de um bloco runBlocking;
 *
 *
 * launch irá iniciar uma corotina, que irá funcionar concorrentemente (ao mesmo tempo) e
 * independente do resto do código, podemos inserir quantos blocos launch que quisermos dentro
 * de um mesmo código;
 *
 *
 * delay é uma função que faz a corotina esperar por um tempo em milisegundos, e voltar com o
 * processamento após esse tempo. Essa função recebe um número do tipo Long, que pode ser criado
 * colocando um L no final de um número;
 *
 *
 * O runBlocking guarda um launch dentro, iniciando uma nova corotina, que a primeira instrução é
 * o delay(1000L), fazendo que a corotina espere por um segundo (1000 milisegundos), enquanto isso
 * o código principal continua, mandando um Olá na tela. E após um segundo da corotina rodando,
 * a proxima e ultima instrução manda um Mundo! na tela.
 * */

    runBlocking {
        launch {
            delay(1_000)
            println("World")
        }
    }
    println("Hello")

}
package br.com.roberto.coroutinebasicsexamples.e

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 *
 * A variável tarefa recebe um launch, logo sendo uma corotina;
 * Dentro da corotina, há um repeat(1000), esse repeat inicia um código que irá rodar por um
 * número determinado de vezes, no caso, 1000 vezes;
 * E dentro desse bloco, é mostrado na tela um texto tarefa: Estou rodando fazem $i vezes,
 * sendo $i o número de vezes que o repeat já repetiu;
 * Depois desse texto ser mostrado na tela, a corotina é suspensa por 500 milesegundos
 * (meio segundo);
 *
 *
 * Agora, a main espera 1.3 segundos, e após isso, será mostrado na tela um texto main: Não quero
 * mais esperar pela tarefa!;
 * Após isso, é usada a função tarefa.cancel() para cancelar a corotina, fazendo a corotina
 * tarefa terminar;
 * Para fazer que o resto do código rode apenas quando a corotina for completamente cancelada,
 * é usada a função tarefa.join() novamente;
 * Após isso, a main escreve na tela main: Agora eu posso fechar
 *
 * Segundo a própria documentação do Kotlin, a função .cancel() cancela a tarefa
 * (corotina sendo armazenada em uma variável), incluindo todas as corotinas iniciadas por essa.
 *
 * */
fun main()= runBlocking {
    val task = launch {
        repeat(1000) {it ->
            println("Task I'am running $it times")
            delay(500L)
        }
    }
    delay(1300)
    println("main: I don´t want to wait more by this task")
    task.cancel()
    task.join()
    println("Now I can close the app")
}


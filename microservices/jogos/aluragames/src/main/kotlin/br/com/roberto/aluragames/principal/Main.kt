package br.com.roberto.aluragames.principal

import br.com.roberto.aluragames.modelo.Gamer
import br.com.roberto.aluragames.modelo.InfoJogo
import br.com.roberto.aluragames.modelo.Jogo
import br.com.roberto.aluragames.servicos.ConsumoApi
import com.google.gson.Gson
import transformarEmIdade
import java.util.*


fun main() {

    val leitura = Scanner(System.`in`)
    val gamer = Gamer.criarGamer(leitura)
    println("Cadastro concluido com sucesso. Dados do gamer:")
    println(gamer)
    println("Idade do Gamer: " + gamer.dataNascimento?.transformarEmIdade())

    do {
        println("Digite o codigo de jogo para buscar:")
        val busca = leitura.nextLine()

        val buscaApiJson = ConsumoApi().buscaJogo(busca)

        var meuJogo: Jogo? = null
        val resultado = runCatching {

            val gson = Gson()
            val meuInfoJogo = gson.fromJson(buscaApiJson, InfoJogo::class.java)

            meuJogo = Jogo(
                meuInfoJogo.info.title,
                meuInfoJogo.info.thumb
            )
        }

        resultado.onFailure {
            println("Jogo inexistente. Tente outro id")
        }

        resultado.onSuccess {
            println("Deseja Inserir uma descrição personalizada? (S/N)")
            val opcao = leitura.nextLine()
            if (opcao.equals("s", true)) {
                println("Insira a descrição personalizada para o jogo:")
                val descricaoPersonalizada = leitura.nextLine()
                meuJogo?.descricao = descricaoPersonalizada
            } else {
                meuJogo?.descricao = meuJogo?.titulo
            }

            gamer.jogosBuscados.add(meuJogo)
        }
        println("Deseja buscar um novo jogo? S/N")
        val resposta = leitura.nextLine()
    } while (resposta.equals("s",ignoreCase = true))

    println("Jogos buscados: ")
    println(gamer.jogosBuscados)

    println("\n Jogos ordenados por titulo: ")
    gamer.jogosBuscados.sortBy { it?.titulo }
    gamer.jogosBuscados.forEach {
        println("Titulo: "+it?.titulo)
    }

    val jogosFiltrados = gamer.jogosBuscados.filter {
        it?.titulo?.contains("batman",true) ?: false
    }

    println("\n Jogos Filtrados")
    println(jogosFiltrados)

    println("Deseja excluir algum jogo da lista original? S/N")
    val opcao = leitura.nextLine()
    if (opcao.equals("s",true)){
        println("\n Informe a posição do jogo que deseja excluuir")
        val posicao = leitura.nextInt()
        gamer.jogosBuscados.removeAt(posicao)
    }

    println("\n Lista Atualizada")
    println(gamer.jogosBuscados)

    println("Busca realizada com sucesso")
}
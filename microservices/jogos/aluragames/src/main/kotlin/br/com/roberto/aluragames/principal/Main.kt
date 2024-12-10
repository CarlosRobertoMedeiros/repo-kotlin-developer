package br.com.roberto.aluragames.principal

import br.com.roberto.aluragames.modelo.InfoJogo
import br.com.roberto.aluragames.modelo.Jogo
import br.com.roberto.aluragames.servicos.ConsumoApi
import com.google.gson.Gson
import java.util.*


fun main() {

    val leitura = Scanner(System.`in`)
    println("Digite o codigo de jogo para buscar:")
    val busca = leitura.nextLine()

    val buscaApiJson = ConsumoApi().buscaJogo(busca)

    var meuJogo:Jogo? = null
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
        if (opcao.equals("s",true)){
            println("Insira a descrição personalizada para o jogo:")
            val descricaoPersonalizada = leitura.nextLine()
            meuJogo?.descricao = descricaoPersonalizada
        }else{
            meuJogo?.descricao = meuJogo?.titulo
        }

        println(meuJogo)
    }

    resultado.onSuccess {
        println("Busca realizada com sucesso")
    }
}
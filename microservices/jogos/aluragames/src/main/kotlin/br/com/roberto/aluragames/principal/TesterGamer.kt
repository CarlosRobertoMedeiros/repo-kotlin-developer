package br.com.roberto.aluragames.principal

import br.com.roberto.aluragames.modelo.Gamer

fun main(){
    val gamer1 = Gamer("Roberto","roberto@email.com")
    println(gamer1)

    val gamer2 = Gamer("Luciene","luciene@email.com","12/12/1981","lulu")
    println(gamer2)

    gamer1.let {
        it.nome="Roberto"
        it.email="roberto@email.com"
    }.also {
        print(gamer1.idInterno)
    }

    gamer2.let {
        it.nome="Luciene"
        it.email="luciene@email.com"
        it.dataNascimento="12/12/1981"
        it.usuario="lulu"
    }

    println(gamer1)
    println(gamer2)

    gamer1.usuario = "betao"
    println(gamer1)

    gamer1.usuario = "betaoXXX"
    println(gamer1)
}

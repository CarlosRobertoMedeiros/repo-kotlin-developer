package br.com.roberto.coroutinebasicsexamples.g

fun main() : Unit {
    val listItems = mutableListOf<Item>()
    listItems.add(Item("Pao-Italiano",10.00))
    listItems.add(Item("Carne",20.00))

    val produto = Produto(tipoBurguer = TiposDeHamburguer.HAMBURGUER_DA_CASA)
    println(produto)


    }


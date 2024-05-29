package br.com.roberto.coroutinebasicsexamples.g

class Produto{

    private val tipoBurguer: TiposDeHamburguer
    private val listItems = mutableListOf<Item>()

    constructor(tipoBurguer: TiposDeHamburguer) {
        if (tipoBurguer==TiposDeHamburguer.HAMBURGUER_DA_CASA){
            listItems.add(Item("Pao-Italiano",10.00))
            listItems.add(Item("Carne",20.00))
        }
        this.tipoBurguer = tipoBurguer
    }

    override fun toString(): String {
        return "Produto(tipoBurguer=$tipoBurguer, listItems=$listItems)"
    }


}
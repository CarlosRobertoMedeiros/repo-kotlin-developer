package f.orientacaoabjetos.classe.`12-Interfaces`

//Interface não guarda estado
// Não consegue instanciar classes e nem instanciar atributos
interface Selvagem {
    fun atacar()
}

abstract class Mamifero(val nome:String){
    fun acordar(){
        println("acordar")
    }
    fun dormir(){
        println("dormir")
    }
    abstract fun falar()
}

class Cachorro(nome: String):Mamifero(nome), Selvagem {
    override fun falar() {
        TODO("Not yet implemented")
    }

    override fun atacar() {
        TODO("Not yet implemented")
    }

}

fun main(){

}
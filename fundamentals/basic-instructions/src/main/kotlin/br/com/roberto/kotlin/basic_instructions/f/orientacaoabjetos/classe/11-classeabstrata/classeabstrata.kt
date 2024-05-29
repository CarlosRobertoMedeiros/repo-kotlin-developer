package f.orientacaoabjetos.classe.`11-classeabstrata`

//Implementa métodos não abstratos
// deve-se usar a palavra abstract ao invés de open
//
abstract class Mamifero(val nome: String){
    fun acordar(){
        println("acordei")
    }
    fun dormir(){
        println("dormi")
    }
    abstract fun falar()
}

class Cachorro(nome: String) : Mamifero(nome){
    override fun falar() {
        TODO("Not yet implemented")
    }
}



fun main(){}

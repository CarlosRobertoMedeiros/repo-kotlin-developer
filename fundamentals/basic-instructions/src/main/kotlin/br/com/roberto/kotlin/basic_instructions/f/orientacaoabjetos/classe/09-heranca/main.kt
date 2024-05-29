package f.orientacaoabjetos.classe.`09-heranca`

//Para implementar herança em kotlin
// a classe deve ser uma open class
// em modificadores de acesso private public(É default) e protected
open class Eletronico(private var marca: String){
    private fun ativarCorrente(){}
    fun ligar(){
        ativarCorrente()
    }
    fun desligar(){}
}

class Computador(marca: String): Eletronico(marca){
    fun instalarSoftware(){}
    fun processar() {}
}



fun main() {
    var computador = Computador("Dell")
    computador.ligar()
    computador.desligar()
}
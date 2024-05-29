package f.orientacaoabjetos.classe.`14-classe_anonima`

interface Event {
    fun onSuccess()
}

class Programa {

    fun salvar(e:Event) {
        println("Sbrindo conexões. ")
        println("Salvando valores. ")
        println("Sucesso. Conexões fechadas. ")
        e.onSuccess()
    }
}



fun main(){
    val p = Programa()
    //o object : Event(Interface) é a maneira do Kotlin utilizar classe anônima
    //Saiu do Contexto acabou a classe anônima
    p.salvar(object : Event {
        override fun onSuccess() {
            println("onSuccess!")
        }

    })
}
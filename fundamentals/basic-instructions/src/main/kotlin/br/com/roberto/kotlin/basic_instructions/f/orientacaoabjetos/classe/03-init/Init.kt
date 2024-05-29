package f.orientacaoabjetos.classe.`03-init`

//O init é executado quando a classe é instanciada
class Animal(var especie:String){
    var fala:String = ""
    init{
        if (especie=="cachorro") fala="au"
        else if (especie=="gato")  fala="miau"
        else fala=""

    }
    fun falar(){
        println(fala)
    }
}

fun main(){
    //Usando Inicialização direto
    Animal("cachorro").falar()
}
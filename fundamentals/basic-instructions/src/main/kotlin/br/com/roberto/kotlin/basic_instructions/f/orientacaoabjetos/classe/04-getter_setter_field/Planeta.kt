package f.orientacaoabjetos.classe.`04-getter_setter_field`

class Planeta {

    //Getter e Setter personalizado
    //field é a palavra reservada para evitar o loop infinito, evitando o return nome ou o set com value
    var nome:String = ""
        get() = field.uppercase() //Getter
        set(value) {
            field = value.trim() //Setter
        }
    //Getter e Setter padrão
    var idade:Int = 18
}

//Automaticamente o Kotlin trabalha a visibilidade da classe
fun main(){
    val planeta =Planeta()
    planeta.nome="Luiz Carlos"
    println("Nome: ${planeta.nome}")
    println("Nome: ${planeta.idade}")
}
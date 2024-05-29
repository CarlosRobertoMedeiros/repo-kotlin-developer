package b.funcoes

fun main(){

    val str = "Programação Kotlin"
    println("String a ser usada '$str'")
    println("O tamanho da String é ${str.length}")
    println("A Posição (index) 0 da String é ${str[0]}")
    println("A String começa com  ${str.startsWith("Pro")}")
    println("A String termina com  ${str.endsWith("abc")}")
    println("A String retorna dentro de uma String ${str.substring(2,5)}")
    println("A String faz replace de uma String ${str.replace("Kotlin","Kotlin é show")}")
    println("A String é colocada em minúsculo ${str.lowercase()}")
    println("A String é colocada em maisculo ${str.uppercase()}")
    println("A String é colocada tudo junto ${str.trim()}")
}
//Exemplos de SobreCarga
fun soma3(){}
fun soma3(a:Int){}
fun soma3(a:Int, b:Int){}


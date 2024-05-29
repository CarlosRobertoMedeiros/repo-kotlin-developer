package c.controledefluxo

fun main(){

    println()
    println("While i <100 ate 0")
    var i=0
    while (i<100){
        print("{$i}")
        i++
    }
    println()
    println("While de acordo com o tamano da string 'Kotlin'")
    val str = "Kotlin"
    var j = 0
    while(j < str.length){
        print("${str[j]}")
        j++
    }


}
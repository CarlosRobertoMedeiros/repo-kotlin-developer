package c.controledefluxo

fun main(){

    println("For com numeros")
    for (i in 1..10){
        print("${i}")
    }
    println()
    println("For com numeros de 2 em 2 subindo")
    for (i in 0..20 step 2){
        print("${i}")
    }
    println()
    println("For com numeros imprimindo ordem inversa")
    println("Maior para menor numero pulando de 3 em 3")
    for (i in 20 downTo 0 step 3){
        print("${i}")
    }
    println()
    println("For linhas da String")
    val str = "Carlos Roberto"
    for (char in str){
        print("${char}")
    }


}
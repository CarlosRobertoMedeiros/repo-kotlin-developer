package c.controledefluxo

fun main(){

    println("While i <9  só que faz o primeiro")
    var i = 0;
    do{
        print("${i}")
        i++
    }while (i < 10)

    println("Force o While enquanto a variável nome não for preenchido ")
    do{
        print("Qual o seu nome: ")
        val value = readLine()
    }while (value =="")


}

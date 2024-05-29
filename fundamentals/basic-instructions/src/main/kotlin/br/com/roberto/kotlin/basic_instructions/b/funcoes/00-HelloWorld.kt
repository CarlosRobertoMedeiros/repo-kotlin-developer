package b.funcoes

fun main(){
    helloWorld()
    helloWorld2()
    println("A soma dos valores 10 e 2 é ${sum(10,2)}")

}

fun helloWorld(){
    println("Função sem Parâmetros e sem Retorno")
    println("Hello, World")
}

fun helloWorld2():Unit{
    println("Função sem Parâmetros e sem Retorno \n" +
            "Unit = Dizer que a função não retorna um valor")
    println("Hello, World 2")
}

fun sum(a:Int, b:Int):Int{
    return a+b
}
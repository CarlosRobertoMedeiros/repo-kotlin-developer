package b.funcoes

fun main(){
    println("A soma de 10 com 2 é ${soma(10,2)}")
    println("A soma de 10 com 2 é ${soma2(10,2)}")
    println("A soma de 10 com 2 é ${helloWorld3()}")
    println("A divisao de 10 com 2 é ${divisao(10f,2f)}")
    println("A divisao de 10 com 2 única Linha é ${divisaoUnicaLinha(10f,2f)}")
    println("A divisao de 10 com 2 única Linha é ${divisaoUnicaLinhaSemRetorno(10f,2f)}")
}

fun soma(a:Int, b:Int):Int = (a+b) //Apenas uma única Instrução
fun soma2(a:Int, b:Int) = (a+b) //Apenas uma única Instrução por ser Int aqui eu não preciso demonstrar retorno
fun helloWorld3() = println("Hello, World")
fun divisao(a:Float,b:Float):Float{
    return a/b;
}
fun divisaoUnicaLinha(a:Float,b:Float):Float = a/b;
fun divisaoUnicaLinhaSemRetorno(a:Float,b:Float) = a/b;

package e.maisfuncoes

fun main() {
    println(calcularMedia(1f,2f,3f,5.75f))
    println(calcularMediaOpcao2(false,2f,3f,5.75f))
}

//Exemplo de Genérics cuidado com os tipos de dados de entrada
fun <T> calcularMedia(vararg notas: T):Float{
    var soma=0f
    for (n in notas) {
        if (n is Float) soma +=n
    }
    return (soma/notas.size)
}

//Exemplo 2 o varargs sempre tem que ser o último a ser exposto na função
fun <T, J> calcularMediaOpcao2(abc:J, vararg notas: T):Float{
    var soma=0f
    for (n in notas) {
        if (n is Float) soma +=n
    }
    return (soma/notas.size)
}

//Exemplo 3 Biblioteca do Kotlin usando Varargs com Generics
fun exemplo3(){
    arrayOf(2,2,3,6,2,6,45f,false)

}



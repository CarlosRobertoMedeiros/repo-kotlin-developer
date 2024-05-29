package i.lambda.a

fun main(){

    //Exemplo Lambda 1
    val a = { println("Hello") }
    a() //Hello

    //Exemplo 2
    val b = { x : Int -> x * x }
    b(10)

    //Exemplo 3
    val c = { x: Int, y : Int ->
        println("Executando")
        x * y
    }
    c(5,15)

    //Exemplos com Função
    val d = {
        println("Hello")
        println("World")
    }
    receiveD(d) //Imprime Hello World com quebra devido ao println

    val e = { x: Int -> x * x }
    receiveE(e)

    val f = { x: Int, y : Int ->
        println("Executando")
        x * y
    }
    val x = receiveF(f)

    //Pode-se Chamar Lambda direto dentro do Método com ou sem os parânteses
    receiveD ({
        println("Hello")
        println("World")
    })






}

// () -> Unit
// { parametros -> corpo }
fun receiveD(lambda: () -> Unit ){lambda()}
fun receiveE(tt: (x : Int) ->  Int ){}
fun receiveF(lamb: (b1: Int, b2: Int) ->  Int ){}


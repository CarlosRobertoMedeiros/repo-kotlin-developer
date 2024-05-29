package c.controledefluxo

fun main(){


    //Break funciona apenas no escopo que esta inserido
    // um Break dentro de um segundo while identado funciona apenas no 2 while como exemplo
    println("Usando Break no caso de i = 50")
    var i = 0
    while (i < 1000000){
        if (i == 50) {
            break
        }
        print("$i")
        i++
    }

    println("")
    println("Usando Break no caso de encontrar a primeira letra b na string 'aslkjfdlsajfbl alkjasfdljlaçjfsl asfsfb'")
    val str = "aslkjfdlsajfbl alkjasfdljlaçjfsl asfsfb"
    var j = 0
    while (j < str.length){
        if (str[j] == 'b') {
            break
        }
        print("$str[j]")
        j++
    }

    println("")
    println("Usando Continue no caso do numero ser < 50 ele retorna ao while sem continuar a execução'")
    var k = 0
    while (k < 80 ){

        if (k < 50){
            k ++
            continue
        }
        print("${k}")
        k++
    }
}
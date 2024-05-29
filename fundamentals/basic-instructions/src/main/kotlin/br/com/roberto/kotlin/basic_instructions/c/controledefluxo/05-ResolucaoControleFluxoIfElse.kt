package c.controledefluxo

fun main(){

    // a) Escreva um programa capaz de ler dois números inteiros que representam os lados de uma figura
    //geométrica. Informar se formam um quadrado (lados iguais).
    println("O sistema é um quadrado perfeito ? ${isQuadradoPerfeito()}")

    //b) Escreva um programa capaz de ler três números inteiros que representam os lados de um triângulo. Informar
    //se é um triângulo equilátero (todos os lados iguais).
    val isTriEquilatero:Boolean = isTrianguloEquilatero()
    println("O triângulo formado é equilátero ? ${isTriEquilatero}")

    // c) Considere o código abaixo. Qual a saída do programa caso informado o valor 4?
    //  fun qualASaida(num: Int) {
    //     if (num >= 0) {
    //       if (num == 0)
    //         println("Primeira string")
    //       else println("Segunda string")
    //     }
    //     println("Terceira string")
    //  }
    //Resposta "Segunda String" e "Terceira string"

    //d) Escreva um programa para ser usado na de portaria de um evento.
    //a. Peça a idade. Menores de idade não são permitidos. Mensagem: “Negado. Menores de idade não são
    //permitidos.”.
    //b. Peça o tipo de convite. Os tipos de convite são comum, premium e luxo. Negar a entrada caso não seja nenhum
    //destes. Mensagem: “Negado. Convite inválido.”.
    //c. Peça o código do convite. Convites premium e luxo começam com “XL”. Convites comuns começam com “XT”.
    //Caso o código não esteja nos padrões, negar a entrada. Mensagem: “Negado. Convite inválido.”.
    //d. Caso todos os critérios sejam satisfeitos, exibir “Welcome :)”.
    portaria()
}

fun portaria(){
    println("Qual a sua idade? ")
    val idade = readLine()
    if (idade != null && idade!="") {
        if (idade.toInt() < 18 ) {
            println("Negado. Menores de idade não são permitidos")
            return
        }
    }
    println("Qual o tipo de convite? ")
    var tipoConvite = readLine();
    if (tipoConvite!=null && tipoConvite!=""){
        tipoConvite = tipoConvite.lowercase()

        if (tipoConvite!="comum" && tipoConvite!="premium" && tipoConvite!="luxo"){
            println("Negado. Convite Inválido")
            return
        }

        println("Qual o código do convite? ")
        var codigo = readLine()

        if (codigo != null && codigo!="") {
            codigo= codigo.lowercase()

            if (tipoConvite=="comum" && codigo.startsWith("xt"))
                println("Welcome :) ")
            else if (tipoConvite=="premium" || tipoConvite=="luxo"
                && codigo.startsWith("xl")){
                println("Welcome :) ")
            }else{
                println("Negado. Convite Inválido")
            }
        }
    }



}

fun isTrianguloEquilatero(): Boolean {
    println("Informe o primeiro Lado")
    val primeiroLado = readLine()
    println("Informe o segundo Lado")
    val segundoLado = readLine()
    println("Informe o terceiro Lado")
    val terceiroLado = readLine()

    if (primeiroLado!=null && primeiroLado!=""
        && segundoLado!=null && segundoLado!=""
        && terceiroLado!=null && terceiroLado!=""){
        val ladoUm: Int = primeiroLado.toInt()
        val ladoDois: Int = segundoLado.toInt()
        val ladoTres: Int = terceiroLado.toInt()

        return (ladoUm==ladoDois && ladoUm==ladoTres)
    }
    return false
}

fun isQuadradoPerfeito():Boolean{
    println("Informe o primeiro Lado")
    val primeiroLado = readLine()
    println("Informe o segundo Lado")
    val segundoLado = readLine()

    if (primeiroLado!=null && primeiroLado!=""
        && segundoLado!=null && segundoLado!=""){
      val ladoUm: Int = primeiroLado.toInt()
      val ladoDois: Int = segundoLado.toInt()
      return  (ladoUm==ladoDois)
    }
    return false
}


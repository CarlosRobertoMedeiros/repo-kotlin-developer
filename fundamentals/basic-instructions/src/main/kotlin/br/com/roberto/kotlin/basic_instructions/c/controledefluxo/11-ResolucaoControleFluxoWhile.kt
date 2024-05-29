package c.controledefluxo

fun main(){
    /*
     a) Considere uma caixa D'agua de 2 mil litros. Rômulo gostaria de enche-la com balões e água de 7 litros.
     Quantos balões cabem na caixa d'água sem que o volume seja excedido ?
     */
    println()
    println("Cabem na caixa d'água ${enchendoBaloes(2000,7)} balões sem que o volume seja excedido")

    /*
    b) FizzBuzz. Imprima os números de 1 a 50 em ordem crescente de acordo com a regra abaixo:
      a. Quando um número for divisível por 3 imprimir Buzz
      b. Quando um número for divisível por 5 imprimir Fizz
      c. Quando um número for divisível por 3 e 5 imprimir FizzBuzz
     */
    println()
    println("Trabalhando na Impressão de Fizz e Buzz")
    println("${imprimirfizzBuzz()}")
    /*
    c) Escreva um programa capaz de receber um texto e imprimí-lo invertido
        Entrada: Meu nome é Carlos. Sainda: Solrac é emon ueM
    */
    println()
    println("Trabalhando recebendo um texto e imprimindo inverso")
    println("${imprimirTextoInverso("Carlos Roberto")}")
    /*
    d) Escreva uma função que recebe uma string, verifica se existe a mesma quantidade de caracteres 'x' e 'o' e
        retorna true ou false, Caso não existe nem 'x', nem 'o', retornar false
        "xxooox" -> true "xxxxo" -> false "asfsfasf" -> false "oooxzzzzz" -> false
     */
    println()
    println("Funcao que verifica Quantidade de Caracteres")
    println("${imprimeQtdeCaracaretes("xxooox")}") //true
    println("${imprimeQtdeCaracaretes("xxxxo")}")  //false
    println("${imprimeQtdeCaracaretes("asfsfasf")}") //false
    println("${imprimeQtdeCaracaretes("oooxzzzzz")}") //false

}
fun imprimeQtdeCaracaretes(str:String):Boolean{
    val strLower = str.lowercase()
    var contX = 0
    var contO = 0

    var i = 0
    while(i < strLower.length){
        if (strLower[i]=='x'){
            contX++
        }else if (strLower[i]=='o') {
            contO++
        }
        i++
    }
    return ((contX == contO) && (contX!=0))


}
fun imprimirTextoInverso(texto:String):String{
    var tamanhoTexto = texto.length
    var textoInvertido =""
    while (tamanhoTexto > 0){
        textoInvertido +=texto[tamanhoTexto-1]
        tamanhoTexto--
    }
    return textoInvertido
}
fun enchendoBaloes(capacidadeCaixa: Int, capacidadeBalao: Int):String{
    var numBaloes = 0
    while((numBaloes * capacidadeBalao) + capacidadeBalao < capacidadeCaixa){
        numBaloes++
    }
    return numBaloes.toString();
}

fun imprimirfizzBuzz(){
    var i = 1
    while(i <=50){
        if (i % 15 ==0) /*(i % 3 ==0 && i % 5 ==0)*/ {
            print("FizzBuzz ")
        }else if (i % 3 ==0){
            print("Buzz ")
        }else if (i % 5 ==0){
            print("Fizz ")
        }else{
            print("$i ")
        }
        i++
    }
}
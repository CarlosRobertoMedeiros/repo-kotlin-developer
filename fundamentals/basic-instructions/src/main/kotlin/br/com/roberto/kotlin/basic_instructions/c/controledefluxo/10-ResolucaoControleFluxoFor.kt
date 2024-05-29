package c.controledefluxo

fun main(){

//a) Imprima os números de 1 a 50 na mesma linha em ordem crescente. Saida esperada
// 1 2 3 4 5 ... 49 50
    imprimaNumerosMesmaLinhaOrdemCrescente()
//b) Imprima os números de 1 a 50 na mesma linha em ordem decrescente. Saida esperada
// 50 49 48 ... 3 2 1
    imprimaNumerosMesmaLinhaOrdemDecrescente()
//c) Usando a resolução do exercício 1, não imprima os número multiplos de 5
    imprimaNumerosMesmaLinhaOrdemCrescenteSemMultiplosDe5()
//d) Faça a soma de todos os números do intervalo de 1 a 500
    somaNumerosIntervalo1a500()
/* e) Escreva um programa capaz de receber um número inteiro N e imprimir uma escada de tamanho N
      usando o caractere #.
      Se a entrada for 3 teremos
      #
      ##
      ###
      Se a entrada for 5 teremos
      #
      ##
      ###
      ####
      #####
 */
    imprimirEscada(5)
}

fun imprimirEscada(numero: Int) {
    println()
    println("Impressão da escada de acordo com o numero informado como parametro nesse caso ${numero}")
    for(i in 1..numero){
        for(j in 1..i) {
            print("#")
        }
        println()
    }
}

fun somaNumerosIntervalo1a500() {
    println()
    println("Soma de todos os números do intervalo de 1 a 500")
    var acum =0
    for (i in 1..500){
        acum +=i
    }
    print("${acum}")
}

fun imprimaNumerosMesmaLinhaOrdemCrescente(){
    println()
    println("Numeros de 1 a 50 mesma linha ordem crescente")
    for (i in 1..50){
        print("${i} ")
    }
}

fun imprimaNumerosMesmaLinhaOrdemCrescenteSemMultiplosDe5(){
    println()
    println("Numeros de 1 a 50 mesma linha ordem crescente sem múltiplos de 5")
    for (i in 1..50){
        if (i % 5 ==0) continue
        print("${i} ")
    }
}

fun imprimaNumerosMesmaLinhaOrdemDecrescente(){
    println()
    println("Numeros de 50 a 1 mesma linha ordem decrescente")
    for (i in 50 downTo 1){
        print("${i} ")
    }
}
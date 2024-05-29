package b.funcoes

fun main(){
    // a) Escreva uma função que seja capaz de receber a quantidade de anos e transformar
    // em meses,dias,horas,minutos e segundos
    // saida desejada 2 anos equivale à 24 meses 730 dias 17520 horas 1051200 minutos e 630472000 segundos
    println(transformaAnos(2))

    // b) Escreva uma função capaz de receber uma String e retornar a quantidade de caracteres
    val textoASerContatadoQtdeCaractere = "Apenas um simples programador kotlin"
    println("A quantidade de Caracteres na String é ${retornaQtdeCaracter(textoASerContatadoQtdeCaractere)}")

    // c) Escreva uma função capaz de calcular o cubo de um número inteiro
    println("O Cubo do Valor 10 é ${calcularCuboNumeroInteiro(10)}")

    // d) Escreva uma função capaz de receber milhas e converter em Km (1 milha = 1.64Km)
    println("A conversão de 10 milhas em Km é ${converteMilhasEmKm(10.0)}")

    // e) Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras a por A e x por x
    println("Troca as LETRASX Na String A por a e X por x ${trocaLetrasNoTexto("LETRASX")}")

}

fun transformaAnos(anos:Byte):String{
    return "${anos * 12} meses " +
            "${anos * 365} dias " +
            "${anos * 365 * 24} horas " +
            "${anos * 365 * 24 * 60}  minutos e " +
            "${anos * 365 * 24 * 60 * 60} segundos "
}

fun retornaQtdeCaracter(texto:String):Int{
    return texto.length
}

fun calcularCuboNumeroInteiro(valor:Int) = valor*valor*valor
fun converteMilhasEmKm(valor: Double) = valor* 1.6
fun trocaLetrasNoTexto(texto:String) = texto.replace("A","a").replace("X","x")

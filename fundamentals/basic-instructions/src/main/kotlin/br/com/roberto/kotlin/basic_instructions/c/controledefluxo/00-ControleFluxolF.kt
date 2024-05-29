package c.controledefluxo

fun main(){
    maiorDeIdade(18);
    maiorDeIdade(17);
    maiorDeIdade(61);

    println("Return If função saudacao true: ${saudacao(true)}")
    println("Return If função saudacao false: ${saudacao(false)}")

    println("Return If função saudacao2 true: ${saudacao2(true)}")
    println("Return If função saudacao2 false: ${saudacao2(false)}")

}

fun saudacao(dia: Boolean): String{
    return if (dia) "Bom dia"
    else "Boa Noite"
}
fun saudacao2(dia: Boolean) = if (dia) "Bom dia" else "Boa Noite"


fun maiorDeIdade(idade:Int){
    if (idade > 17){
        println("Maior de Idade")

        if (idade > 60){
            println("Terceira Idade")
        }

    }else{
        println("Menor de Idade")
    }
}
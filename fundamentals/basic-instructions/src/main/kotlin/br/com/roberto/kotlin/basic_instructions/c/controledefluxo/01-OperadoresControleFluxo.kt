package c.controledefluxo

fun main(){
    var a=10
    var b=5
    var valorA=true
    var valorB=true
    var valorC=true
    var valorD=true

    if (a <= b) {}  // <= Menor ou Igual
    if (a == b) {}  // == Igual
    if (a != b) {}  // != Diferente
    if (!valorA) {}  // ! Negação
    if (valorA && valorB) {}  // Conjunção Vai ser executado se ambas forem verdade
    if (valorA || valorB) {}  // Disjunção Vai ser executado se apenas 1 for verdade

    //Ordem de Priorização dos Operadores
    println("Parenteses, !Negacao, && Conjunção, || Dijunção")
    if ((valorA && valorB ) || (valorC && valorD )) {}

    println("Ficar atento as prioridades")
    if (valorA && (valorB || valorC) && valorD)

    println("Teste de Intervalo de Valores")
    if (a >= 1 && a <=11) {}
    println("Melhor Abordagem Kotlin")
    if (a in 1..11) {}

}





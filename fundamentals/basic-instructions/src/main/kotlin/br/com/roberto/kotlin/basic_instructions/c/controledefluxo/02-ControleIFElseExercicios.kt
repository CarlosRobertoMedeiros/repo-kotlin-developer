package c.controledefluxo

fun main(){
    // a) Escreva um programa que ajude a empresa XPTO calcular o bônus que os funcionários vão receber
    // no final do ano. Os bônus são classificados por cargos
    println("Bonus para Cargo Gerentes ${calculaBonus("Gerentes")} ")
    println("Bonus para Cargo Coordenadores ${calculaBonus("Coordenadores")} ")
    println("Bonus para Cargo Engenheiros ${calculaBonus("Engenheiros")} ")
    println("Bonus para Cargo Estagiarios ${calculaBonus("Estagiarios")} ")
    println("Bonus para Cargo Desconhecido ${calculaBonus("Generico")} ")

    // b) Modifique o primeiro exercício para considerar o tempo de experiência no calculo do bônus
    println("Bonus para Cargo Gerentes com mais de 2 anos de experiência ${calculaBonusComExperiencia("Gerentes",3)} ")
    println("Bonus para Cargo Gerentes com menos de 2 anos de experiência ${calculaBonusComExperiencia("Gerentes",1)} ")
    println("Bonus para Cargo Coordenadores com mais de 2 anos de experiência ${calculaBonusComExperiencia("Coordenadores",3)} ")
    println("Bonus para Cargo Coordenadores com menos de 2 anos de experiência ${calculaBonusComExperiencia("Coordenadores",1)} ")
    println("Bonus para Cargo Engenheiros ${calculaBonusComExperiencia("Engenheiros", 0)} ")
    println("Bonus para Cargo Estagiarios ${calculaBonusComExperiencia("Estagiarios", 0)} ")
    println("Bonus para Cargo Desconhecido ${calculaBonusComExperiencia("Generico", 0)} ")

    // c) Qual o resultado das expressões
    val a = false
    val b = false
    val c = true
    val d = true

    println("O resultado da expressão 'a && b && c && d' é ${a && b && c && d}")
    println("O resultado da expressão '!a && !b && (c && d)}' é  ${!a && !b && (c && d)}")
    println("O resultado da expressão 'a && ((b || c) || d)'é ${a && ((b || c) || d)} ")
    println("O resultado da expressão 'a || ((!b && c) || d))' é ${a || ((!b && c) || d)}")

}

fun calculaBonus(cargo:String) = if (cargo.equals("Gerentes")) 2000.00f
                                 else if (cargo.equals("Coordenadores")) 1500.00f
                                 else if (cargo.equals("Engenheiros")) 1000.00f
                                 else if (cargo.equals("Estagiarios")) 500.00f
                                 else 0.00f

fun calculaBonusComExperiencia(cargo:String, experiencia:Int) = if (cargo.equals("Gerentes") && experiencia <2 ) 2000.00f
                                                                else if (cargo.equals("Gerentes") && experiencia >=2 ) 3000.00f
                                                                else if (cargo.equals("Coordenadores")&& experiencia <2) 1500.00f
                                                                else if (cargo.equals("Coordenadores")&& experiencia >=2) 1800.00f
                                                                else if (cargo.equals("Engenheiros")) 1000.00f
                                                                else if (cargo.equals("Estagiarios")) 500.00f
                                                                else 0.00f
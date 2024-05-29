package c.controledefluxo

//Continuar do 37 a partir de 5 minutos
fun main(){
    println ("Segue a implementação de bonus para tipo desconhecido ${bonusReturnIf("asdfasdf")}")
    println ("Segue a implementação de bonus para tipo Gerente ${bonusReturnIf("Gerente")}")
    println ("Segue a implementação de bonus para tipo Coordenador ${bonusReturnIf("Coordenador")}")
    println ("Segue a implementação de bonus para tipo Engenheiro de Software ${bonusReturnIf("Engenheiro de Software")}")
    println ("Segue a implementação de bonus para tipo Estagiario ${bonusReturnIf("Estagiario")}\n")

    println ("Segue a implementação de bonus para tipo desconhecido ${bonusWhen("asdfasdf")}")
    println ("Segue a implementação de bonus para tipo Gerente ${bonusWhen("Gerente")}")
    println ("Segue a implementação de bonus para tipo Coordenador ${bonusWhen("Coordenador")}")
    println ("Segue a implementação de bonus para tipo Engenheiro de Software ${bonusWhen("Engenheiro de Software")}")
    println ("Segue a implementação de bonus para tipo Estagiario ${bonusWhen("Estagiario")}\n")

    println ("Segue a implementação de bonus menos verboso para tipo desconhecido ${bonusWhenMenosVerboso("asdfasdf")}")
    println ("Segue a implementação de bonus menos verboso para tipo Gerente ${bonusWhenMenosVerboso("Gerente")}")
    println ("Segue a implementação de bonus menos verboso para tipo Coordenador ${bonusWhenMenosVerboso("Coordenador")}")
    println ("Segue a implementação de bonus menos verboso para tipo Engenheiro de Software ${bonusWhenMenosVerboso("Engenheiro de Software")}")
    println ("Segue a implementação de bonus menos verboso para tipo Estagiario ${bonusWhenMenosVerboso("Estagiario")}")

    //comparando lista de números
    val n = 10;
    when(n){
        in 1..10 -> println("1..10")
        in 10..100 -> println("10..100")

    }

    //comparando lista boleana
    val vbool =false
    when (vbool){
        true -> println("1..10")
        false -> println("10..100")
    }


}
fun bonusReturnIf (cargo:String):Float{
    return if (cargo=="Gerrente") 2000f
    else if (cargo=="Coordenador") 1500f
    else if (cargo=="Engenheiro de Software") 1000f
    else if (cargo=="Estagiario") 500f
    else 0f
}

fun bonusWhen(cargo:String):Float{
    var bonus = 0f
    when (cargo){
        "Gerente" -> bonus = 2000f
        "Coordenador" -> bonus = 1500f
        "Engenheiro de Software" -> bonus = 1000f
        "Estagiario" -> bonus = 500f
    }
    return bonus
}

fun bonusWhenMenosVerboso(cargo:String):Float{
    return when (cargo){
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro de Software" -> 1000f
        "Estagiario" -> 500f
        else -> 0f
    }
}
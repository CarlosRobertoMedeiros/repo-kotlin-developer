package a.conceitosiniciais

fun main(){
    var idade = 30
    idade = idade + 1
    idade = idade - 5
    idade = idade * 2
    idade = idade / 2
    println(idade)

    //Idade resumida
    var idade2 = 30
    idade2+=1
    idade2-=5
    idade2*=2
    idade2/=2
    println(idade2)

    //Resto da Divisao (Mod)
    var idade3 = 10 % 3
    println(idade3)

    //Incrementa Usa
    var idade4 = 10
    println(idade4++) //Aqui idade4 foi incrementada
    println(idade4)  // Aqui na proxima execução demonstrou o valor incrementado 11

    var idade5 = 10
    println(++idade5) //Aqui idade5 foi incrementada 11
    println(idade5)  // Aqui na proxima execução demonstrou o valor incrementado 11

    var idade6 = 10
    println(--idade6) //Aqui idade6 foi incrementada 9
    println(idade6)  // Aqui na proxima execução demonstrou o valor incrementado 9

    var idade7 = 10
    println(idade7--) //Aqui idade7 foi incrementada 10
    println(idade6)  // Aqui na proxima execução demonstrou o valor incrementado 9



}
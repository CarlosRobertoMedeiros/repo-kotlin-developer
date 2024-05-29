package g.colecoes

fun main(){

    //Obs: O Cuidado com o Map é que ele substitui o valor, verifique 2 entradas que são
    // Alemanha, porem ao imprimir o map 1 ele mostra {França=Paris, Alemanha=xpot}
    //Chave - Valor
    val map1 = mapOf<String,String>(Pair("França","Paris"),Pair("Alemanha","Berlim"),
                                    Pair("Alemanha","xpot")) //{França=Paris, Alemanha=xpot}

    println(map1.entries) //[França=Paris, Alemanha=xpot]
    println(map1.values) //[Paris, xpot]

    val map2 = mutableMapOf<String,String>(Pair("França","Paris"),Pair("Alemanha","Berlim"))
    map2["Brasil"] = "Brasília"
    println(map2) //{França=Paris, Alemanha=Berlim, Brasil=Brasília}

    map2.remove("Brasil") //{França=Paris, Alemanha=Berlim}
    println(map2)

    println(map2.contains("Brasil")) // false

    map2.clear()
    println(map2) // {}


}
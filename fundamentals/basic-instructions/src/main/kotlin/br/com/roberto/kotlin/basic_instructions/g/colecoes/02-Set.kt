package g.colecoes

fun main(){

    // O Set é uma Collection
    //Usando Set sendo um conjunto Não ordenando de valores não duplicados
    //Set
    //SetOf não modifica o Set
    val set1 : Set<String> = setOf<String>("Paris","Berlim","Madrid","Madrid")
    println(set1)

    //mutableSetOf modifica o Set
    val set2 : MutableSet<String> = mutableSetOf<String>()
    set2.add("São Paulo")
    set2.remove("São Paulo")
    set2.contains("São Paulo")

    set2.clear()
    set2.size






}
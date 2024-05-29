package g.colecoes

fun main(){

    // O List é uma Collection sendo um conjunto ordenado
    //Usando Lista
    //List
    //ListOf não modifica a lista
    val list1: List<Int> = listOf(1, 2, 3, 4, 5)

    //mutableListOf modifica a lista
    val list2: MutableList<Int> = mutableListOf(1,2,3,4,5)

    println(list2[0])
    println(list2.size)

    list2.add(8)
    list2.add(10)

    list2.remove(8)
    list2.removeAt(0) // Remove o índice

    println(list2.contains(1))
    println(list2)

    list2.clear()
    println(list2)

}
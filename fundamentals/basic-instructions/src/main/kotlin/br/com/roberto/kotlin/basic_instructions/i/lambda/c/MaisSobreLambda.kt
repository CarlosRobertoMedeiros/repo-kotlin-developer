package i.lambda.c


// top level declaration
const val CONST_2 = 10 // -> melhor prática

//Const em Classe tem que ser dentro de um companion object
class Const{
    val ABC = "" // -> Essa é a melhor prática para declarar uma constante dentro de uma classe em kotlin
    companion object{
        const val abc = false
    }

}

fun main(){

}

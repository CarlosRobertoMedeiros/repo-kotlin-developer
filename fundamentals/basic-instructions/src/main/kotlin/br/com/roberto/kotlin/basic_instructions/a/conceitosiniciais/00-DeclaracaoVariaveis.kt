package a.conceitosiniciais

/**
Type    Bit
Double  64
Float   32
Long    64
Int     32
Short   16
Byte     8
Boolean  ? 0 u 1 um bit
String   ?
Char     ?
 */
fun main() {
    println("Declaração de Variáveis")

    var nome: String = "Carlos Roberto"; //Declaração de Variável String
    println(nome);
    numericos()
    inicializacaoDeVariaveis();


//    println("Boolean MAX ${Boolean.MAX_VALUE} - Min ${Double.MIN_VALUE}");
//    println("String MAX ${String.MAX_VALUE} - Min ${Double.MIN_VALUE}");
    println("Char MAX ${Char.MAX_VALUE} - Min ${Char.MIN_VALUE}");
}

fun inicializacaoDeVariaveis() {

    var c: Char = 'A'
    var s: String = "Carlos Roberto"
    var b: Boolean = false

    var double: Double = 10.0
    var float: Float = 10f
    var long: Long = 10L
    var int: Int = 10
    var short: Short = 10
    var byte: Byte = 10

    var idade = 40  // Caso o Kotlin faça a inferência de valor ele entende que a variável é inteira
    var idade2 : Byte = 40
    println(idade2);


}

fun numericos() {
    println("Double MAX ${Double.MAX_VALUE} - Min ${Double.MIN_VALUE}");
    println("Float MAX ${Float.MAX_VALUE} - Min ${Float.MIN_VALUE}");
    println("Long MAX ${Long.MAX_VALUE} - Min ${Long.MIN_VALUE}");
    println("Int MAX ${Int.MAX_VALUE} - Min ${Int.MIN_VALUE}");
    println("Short MAX ${Short.MAX_VALUE} - Min ${Short.MIN_VALUE}");
    println("Byte MAX ${Byte.MAX_VALUE} - Min ${Byte.MIN_VALUE}");
}
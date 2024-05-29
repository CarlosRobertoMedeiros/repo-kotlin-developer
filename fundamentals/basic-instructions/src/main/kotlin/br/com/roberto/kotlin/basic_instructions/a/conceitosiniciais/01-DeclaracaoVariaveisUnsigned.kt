package a.conceitosiniciais

fun main() {
    println("Declaração de Variáveis Unsigned - Sem Sinal do 0 ao 255 " +
            "\nFloat e Double não tem Unsigned .." +
            "\nApenas Números Inteiros")


    println("ULong MAX ${ULong.MAX_VALUE} - Min ${ULong.MIN_VALUE}");
    println("UInt MAX ${UInt.MAX_VALUE} - Min ${UInt.MIN_VALUE}");
    println("UShort MAX ${UShort.MAX_VALUE} - Min ${UShort.MIN_VALUE}");
    println("UByte MAX ${UByte.MAX_VALUE} - Min ${UByte.MIN_VALUE}");


    var abc: UInt = 0u // se for -1 não aceita
    var short: UShort = 10u
    var byte: UByte = 10u
    var long: ULong = 10u



}
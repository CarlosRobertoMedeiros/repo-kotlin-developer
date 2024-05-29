package a.conceitosiniciais

fun main() {
   val nome = "Tony"
   val sobrenome = "Stark"

    println("Olá ,"+nome+" "+sobrenome)
    println("Olá, $nome $sobrenome") //Interpolação de Variável

    println("Double: ${Double.MAX_VALUE}") //Aqui é diferente pois o atributo MAX_VALUE tem que ser acessada

    var str = "asdfasfasfsafsaf" +
            "asfdsafasfsadfasfasfasfasfasf" +
            "asdfasfsafsafsafsafsafsafsafsfsfsd"

    println("Tamanho da String ${str.length}")
}
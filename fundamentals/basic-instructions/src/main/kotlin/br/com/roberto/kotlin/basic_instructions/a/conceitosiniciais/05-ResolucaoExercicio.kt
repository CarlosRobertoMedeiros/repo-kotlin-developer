package a.conceitosiniciais

fun main(){
    // a) Crie um Novo Arquivo com uma função Main -- OK
    // b) Declare uma variável mutável capaz de armazenar seu nome completo
    var nome="Carlos Roberto Medeiros de Lima"
    // c) Declare uma variável de texto sem valor algum
    var nome2:String
    // d) Declare uma variável imutável com o menor tipo possível capaz de armazenar o número que você calça
    val meuCalcado:Byte = 43
    // e) Declare uma variável capaz de armazenar o PIB do Brasil (1.896.000.000.000)
    val pibBrasil:Long = 1896000000000
    // f) Declare uma variável capaz de armazenar a população do Brasil (211.000.000)
    val popBrasil:Int = 211000000
    // g) Imprima o valor do PIB per capita
    println("O valor do PIB per capita do Brasil é R$ ${pibBrasil/popBrasil}")

}

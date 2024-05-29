package e.maisfuncoes

fun main() {
    //chamada padrão utilizando como default o numero não precisando informar
    endereco("street","city","sp","5868")
    //chamada padrão utilizando o nome dos atributos na cahama
    endereco(cidade="cidade", rua="rua", cep="72017", endereco = "endereco")
    println(media(1f,2f,3f,5.75f))
}


//Posso informar valor padrão para não precisar chamar no método
fun endereco(rua:String, cidade:String, endereco:String, cep:String, numero:Int = 0){
}

//Exemplo de Função para realizar um calculo de médias modificando apenas  a quantidade de parâmetros informadas
// no chamador da função
fun media(vararg notas:Float):Float{
    var soma=0f
    for (n in notas) {
        soma +=n
    }
    return (soma/notas.size)
}
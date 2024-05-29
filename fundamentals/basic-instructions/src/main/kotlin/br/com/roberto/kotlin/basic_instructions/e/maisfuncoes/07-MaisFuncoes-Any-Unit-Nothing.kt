package e.maisfuncoes

fun main() {
    //Any, Unit e Nothing

   valores(false)
}


//Qualquer tipo de Dados é Any
//Existem diferenças entre Any e Generics até aqui não
fun valores(value: Any){}

// Unit quer dizer que uma função é void(Não tem retorno)
fun valoresResposta(value: Any):Unit{}


//Caso Frequente, quando queremos retornar uma exceção da função
//Serve muito para dar nome dos métodos para ser realizado implementação no futuro.
fun valoresResposta2(value: Any):Nothing{
    TODO("Não Implementado")
}







package d.excecoesnullsafety

fun main(){

  val str: String? = null
  if (str==null){
      println("nulo")
  }else{
      println("str")
  }

  //Operador Elvis substitui os comandos acima
  val str2: String? = null
  println(str ?: "nulo")

  //No Kotlin não tem ternário
  //Simulação de Uso
  //Pois pode-se associar direto a variável conforme exemplo abaixo
  val idade = 18
  val str3 = if (idade> 18) "Maior de Idade" else "Menor de Idade"
  println("Exemplo equivalente ao ternário ${str3}")



}
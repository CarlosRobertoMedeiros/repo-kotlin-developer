package d.excecoesnullsafety

fun main(){
    // Null Safety => NullPointerException
    // Acesso a variável que nunca foi inicializada
    /*
    Exemplo em Java
      public static void main(String[]args){
        String s = null
        System.out.println(s.length())
      }
      A resposta é => NullPointerException
      Pois estou tentando acessar uma variável não instanciada
     */
    var s: String? = null
    //logica
    println(s?.length) // O Kotlin trata caso exista algum problema de null safety
    println(s!!.length) // O Kotlin não trata permitindo que eu assuma os problemas





}
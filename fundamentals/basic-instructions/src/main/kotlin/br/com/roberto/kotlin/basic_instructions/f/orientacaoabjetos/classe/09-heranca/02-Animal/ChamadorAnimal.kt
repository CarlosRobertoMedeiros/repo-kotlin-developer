package f.orientacaoabjetos.classe.`09-heranca`.`02-Animal`

fun main(){
    val cachorro:Animal = Cachorro("AuAu")
    val gato:Animal = Gato("Miau")


    println(cachorro.fazerBaruho())
    println(gato.fazerBaruho())


}
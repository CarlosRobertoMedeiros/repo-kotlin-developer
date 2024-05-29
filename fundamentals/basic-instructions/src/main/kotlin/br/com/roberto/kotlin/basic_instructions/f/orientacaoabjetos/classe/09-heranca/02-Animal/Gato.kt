package f.orientacaoabjetos.classe.`09-heranca`.`02-Animal`

class Gato(nome:String) : Animal(nome) {
    override fun fazerBaruho() {
        println("O $nome está miando")
    }
}
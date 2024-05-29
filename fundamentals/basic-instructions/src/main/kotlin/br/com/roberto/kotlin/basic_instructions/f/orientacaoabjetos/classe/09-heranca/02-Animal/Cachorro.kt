package f.orientacaoabjetos.classe.`09-heranca`.`02-Animal`

class Cachorro(nome:String) : Animal(nome) {
    override fun fazerBaruho() {
        println("O $nome está latindo")
    }
}
package f.orientacaoabjetos.classe.`09-heranca`.`02-Animal`

open class Animal(val nome:String) {
    open fun fazerBaruho(){
        println("$nome esta fazendo barulho")
    }
    open fun emitirSon(animal:Animal){
        animal.fazerBaruho()

    }
}
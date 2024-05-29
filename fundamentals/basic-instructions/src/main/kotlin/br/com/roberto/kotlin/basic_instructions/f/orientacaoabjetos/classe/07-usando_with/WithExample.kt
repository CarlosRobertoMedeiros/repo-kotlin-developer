package f.orientacaoabjetos.classe.`07-usando_with`

class Person(val yearOfBirth: Int , var name:String) {
    var doc: String ? = null

    constructor(yearOfBirth: Int , name:String, doc:String) : this(yearOfBirth, name) {
        this.doc = doc
    }
    fun sleep(){}
    fun wakeup(){}

}

fun  main(){
    val p = Person(1985,"Frank")
    p.sleep()
    p.wakeup()

    //Melhora a leitura
    // Usado para facilitar a escrita
    with(p) {
        sleep()
        wakeup()
    }

}
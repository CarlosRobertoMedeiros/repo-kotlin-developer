package f.orientacaoabjetos.classe.`02-construtor`

class Pessoa(val anoNascimento: Int, var nome:String) {
    var document:String?=null;
    constructor(anoNascimento:Int, nome:String, documented: String) : this(anoNascimento,nome){
        this.document = document;
    }
    fun dormir(){}
    fun acordar(){}
}

fun main(){
    //var pessoa:Pessoa=Pessoa(1981,"Carlos","123456");
    var pessoa = Pessoa(1981,"Carlos","123456");
    pessoa.acordar()
    pessoa.dormir()
}

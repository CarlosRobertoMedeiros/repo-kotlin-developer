package f.orientacaoabjetos.classe.`01-geral`


class Pessoa(val anoNascimento: Int = 2024, var nome:String) {

    fun dormir(){}
    fun acordar(){}

    fun main(){
        //class - Comportamento e atributos

        // classe (instancia) objetos
        var pessoa: Pessoa = Pessoa(1981,"Fulano") //atributos

        this.acordar() //Métodos
        this.dormir()

    }
}
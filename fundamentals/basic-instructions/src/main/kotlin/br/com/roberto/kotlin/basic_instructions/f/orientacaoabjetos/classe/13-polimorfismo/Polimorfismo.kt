package f.orientacaoabjetos.classe.`13-polimorfismo`

interface Funcionario {
    var salario: Float
    fun bonus():Float
}
class Gerente(override var salario: Float) : Funcionario{
    override fun bonus(): Float {
        return salario * 0.5f
    }
}

class Analista(override var salario: Float) : Funcionario {
    override fun bonus(): Float {
        return salario * 0.3f
    }
}

fun mostraBonus(func: Funcionario){
    println(func.bonus())
}

fun main(){
    //Abstração, Encapsulamento, Herança e Polimorfismo <-
    mostraBonus(Gerente(5000f))
    mostraBonus(Analista(5000f))
}
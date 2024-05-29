package f.orientacaoabjetos.classe.`10-object-companionobject`

// o Companion Object utiliza a mesma regra do
// Static do java
// Sendo um objeto da classe e não do objeto
// O companion object é um por classe
class Matematica {

    companion object NOME{
        val PI = 3.1415
        fun teste(){}

        init {
            println("Fui acessado apenas uma vez por ser variável de classe")
        }
    }

    object obj1 {
        val PI = 3.1415
    }

    object obj2 {
        val PI = 3.1415
    }

}


fun main(){
    Matematica.PI
    Matematica.PI
    Matematica.PI

    Matematica.teste()
    val m = Matematica()

    Matematica.obj1.PI
    Matematica.obj2.PI




}
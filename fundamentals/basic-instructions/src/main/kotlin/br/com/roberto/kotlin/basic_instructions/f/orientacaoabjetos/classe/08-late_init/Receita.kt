package f.orientacaoabjetos.classe.`08-late_init`

/**
 * Para resolver casos de nullsafe onde temos que colocar
 * no kotlin var instrucoes : String? = null isso vai me forçar sempre
 * a retornar um objeto que pode ou não ter valor
 *
 * Uma alternativa com cuidados é utilizar o lateinit com cuidados
 *
 * o lateinit só vai ser inicializado após ser realizado algumas instruções
 * não existe endereço de memória após ser inicializado
 *
 * */
class Receita {
    lateinit var instrucoes: String

    fun geraReceita(){
        instrucoes = "Lave as mãos."
    }

    fun imprimeReceita(){
        //Verifica se uma variável lateinit foi instanciada
        if (!this::instrucoes.isInitialized){
          geraReceita()
        }

    }
}

fun main(){
    var r = Receita()
    r.imprimeReceita()
    println(r.instrucoes)
}
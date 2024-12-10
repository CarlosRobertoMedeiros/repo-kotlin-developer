package br.com.roberto.aluragames.modelo

import kotlin.random.Random

data class Gamer(var nome:String , var email:String){
    var dataNascimento:String? = null
    var usuario:String? = null
        set(value) {
            field = value
            if (idInterno.isNullOrBlank()){
                criarIdinterno()
            }
        }
    var idInterno:String? = null
        private set

    constructor(nome: String, email: String, dataNascimento:String, usuario:String) :
        this(nome,email){
            this.dataNascimento = dataNascimento
            this.usuario = usuario
            criarIdinterno()
        }

    override fun toString(): String {
        return "Gamer(nome='$nome', email='$email', dataNascimento=$dataNascimento, usuario=$usuario, idInterno=$idInterno)"
    }

    fun criarIdinterno(){
        val numero = Random.nextInt(10000)
        val tag = String.format("%04d",numero)

        idInterno = "$usuario#$tag"
    }


}

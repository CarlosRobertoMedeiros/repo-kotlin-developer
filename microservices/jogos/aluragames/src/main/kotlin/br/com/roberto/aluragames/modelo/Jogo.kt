package br.com.roberto.aluragames.modelo

import com.google.gson.annotations.Expose
import java.math.BigDecimal

data class Jogo(@Expose val titulo:String,
                @Expose val capa:String ) : Recomendavel {
    var descricao:String?  = null
    var preco = BigDecimal(0.0)
    private val listaNotas = mutableListOf<Int>()

    constructor(titulo: String, capa: String, preco: BigDecimal, descricao: String):
            this(titulo, capa) {
        this.preco = preco
        this.descricao = descricao
    }

    override val media: Double
        get() = listaNotas.average()

    override fun recomendar(nota: Int) {
        val isNotaInValida = (nota < 1 || nota > 10 )
        if (isNotaInValida )
            println("Nota Inválida. Insira uma nota entre 1 e 10")
        else
            listaNotas.add(nota)
    }

    override fun toString(): String {
        return "Meu Jogo: \n" +
                "Título: $titulo \n" +
                "Capa: $capa \n" +
                "Descricao: $descricao" +
                "Preço: $preco"
    }


}
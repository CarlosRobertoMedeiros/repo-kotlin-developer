package br.com.roberto.aluragames.modelo

interface Recomendavel {
    val media: Double

    fun recomendar(nota: Int)
}
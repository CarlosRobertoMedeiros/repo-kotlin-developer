package h.projetooo.business

import h.projetooo.entity.Convidado

class ConvidadoBusiness {
    fun tipoValido(tipo : String) = (tipo == "comum" || tipo == "premium" || tipo == "luxo")

    fun maiorDeIdade(idade: Int) = idade >= 18

    fun convidadoValido(convidado: Convidado) = when (convidado.tipo) {
        "comum" -> convidado.codigo.startsWith("xt")
        "premium", "luxo" -> convidado.codigo.startsWith("xl")
        else -> false
    }
}
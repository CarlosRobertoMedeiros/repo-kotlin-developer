package h.projetooo.control

import h.projetooo.business.ConvidadoBusiness
import h.projetooo.entity.Convidado

class Portaria {

    private val convidadoBusiness = ConvidadoBusiness()

    init {
        println("Portaria Inicializada.")
        println(controle())
    }

    private fun controle() : String {
        val idade = Console.readInt("Qual a sua idade? ")
        val convidado = Convidado(idade = idade)

        if (!convidadoBusiness.maiorDeIdade(convidado.idade)) {
            return "Negado. Menores de idade não são permitidos."
        }

        convidado.tipo = Console.readString("Qual o tipo de convite? ")
        if (!convidadoBusiness.tipoValido(convidado.tipo)) {
            return "Negado. Convite inválido"
        }

        convidado.codigo = Console.readString("Qual o código do convite? ")
        if (!convidadoBusiness.convidadoValido(convidado)) {
            return "Negado. Convite inválido"
        }

        return "Welcome :)"
    }
}



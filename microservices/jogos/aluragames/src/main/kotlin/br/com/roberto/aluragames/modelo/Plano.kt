package br.com.roberto.aluragames.modelo

sealed class Plano(val tipo : String){

    open fun obterValor(aluguel: Aluguel) : Double {
        return aluguel.jogo.preco * aluguel.periodo.emDias
    }

}

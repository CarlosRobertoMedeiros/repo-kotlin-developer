package br.com.roberto.aluragames.utilitario

import br.com.roberto.aluragames.modelo.InfoJogoJson
import br.com.roberto.aluragames.modelo.Jogo

fun InfoJogoJson.criaJogo(): Jogo {
    return Jogo(this.titulo, this.capa, this.preco, this.descricao)
}
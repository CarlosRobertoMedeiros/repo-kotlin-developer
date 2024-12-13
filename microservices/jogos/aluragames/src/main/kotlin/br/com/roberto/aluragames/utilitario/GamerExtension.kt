import br.com.roberto.aluragames.modelo.Gamer
import br.com.roberto.aluragames.modelo.InfoGamerJson

fun InfoGamerJson.criaGamer(): Gamer{
    return Gamer(this.nome,
        this.email,
        this.dataNascimento,
        this.usuario)
}
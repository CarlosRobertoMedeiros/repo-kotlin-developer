import br.com.roberto.aluragames.servicos.ConsumoApi

fun main(){

    val consumo = ConsumoApi()
    val listaGamers = consumo.buscaGamers()
    val listaJogosJson = consumo.buscaJogosJson()

    val gamerCaroline = listaGamers.get(3)
    val jogoResidentVillage = listaJogosJson.get(10)

    println(gamerCaroline)
    println(jogoResidentVillage)

    val aluguel = gamerCaroline.alugaJogo(jogoResidentVillage)
    println(aluguel)

}
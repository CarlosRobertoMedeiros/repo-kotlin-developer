package g.colecoes

fun main(){

    val data = geraDados()

    //any = algum resultado
    println("Tenho Dados? ${if (data.any()) "sim" else "não"}") //sim
    //count = quantidade de registros
    println("Tenho ${data.count()} elementos.") //6
    //first = primeiro item do conjunto
    println("Primeira receita: ${data.first()}") //Receita(nome=Lasanha, calorias=1200, ingredientes=[Ingrediente(nome=Presunto, quantidade=5), Ingrediente(nome=Queijo, quantidade=10), Ingrediente(nome=Molho de tomate, quantidade=2), Ingrediente(nome=Manjerição, quantidade=3)])
    //last = ultimo item do conjunto
    println("Última receita: ${data.last()}") //Receita(nome=Hamburguer, calorias=2000, ingredientes=[Ingrediente(nome=Pão, quantidade=1), Ingrediente(nome=Hamburguer, quantidade=3), Ingrediente(nome=Queijo, quantidade=1), Ingrediente(nome=Catupiry, quantidade=1), Ingrediente(nome=Bacon, quantidade=3), Ingrediente(nome=Alface, quantidade=1), Ingrediente(nome=Tomate, quantidade=1)])

    //Caso eu tenha uma lista vazia preciso alterar para não quebrar o programa
    println(listOf<Int>().firstOrNull()) //null
    println(listOf<Int>().lastOrNull()) //null

    //sum -> Função que soma alguma coisa ... Precisamos de números para isso
    println(listOf<Int>().sum()) //0
    println(listOf<Double>(1.5,6.2,3.2).sum())  //10.9

    //sumOf
    println(data.sumOf { it.calorias }) //4900

    //filter
    //Variação com Predicate
    data.filter { it.calorias > 500 }

    //any
    //Variação com Predicate
    data.any { it.calorias > 500 }

    //count
    //Variação com Predicate
    data.count { it.calorias > 500 }

    //take = Primeiros elementos
    println(data.take(2)) // duas primeiras receitas

    //takelast = Últimos elementos
    println(data.takeLast(2)) // duas últimas receitas


    //forEach = Para cada item imprima o nome
    data.forEach { println(it.nome) }

    //Combinado filter com forEach
    data.filter { it.calorias > 500 }
        .forEach{ println(it.nome) }

    //Max e Min
    println(" receita com mais calorias: ${data.maxOf { it.calorias }}")

    println(" receita com menos calorias: ${data.minOf { it.calorias }}")

    listOf(1,4,9).maxOf { it }
    listOf(1,4,9).maxOrNull()

    listOf(1,4,9).minOf { it }
    listOf(1,4,9).minOrNull()

    println(data.maxByOrNull { it.calorias }) // Aqui Retorna o objeto
    println(data.maxOf { it.calorias }) //aqui a maior quantidade de calorias


    //Exemplo função Map
    //Serve quando quer reduzir as estruturas
    println(data.map { it.nome }) //map transforma o resultado => Criando uma lista apenas com os nomes

    //Exemplo de Transformação função Map
    println(data.map { ReceitaNIngredientes(it.nome, it.ingredientes.count()) })

    //Average
    listOf(1,2).average()
    data.map { it.calorias}.average()

    //distinct sorted e reversed
    val lst = listOf(1,4,5,6,3,2,8,1,1,1,1,3)
    println(lst.distinct())
    println(lst.distinctBy { it }) //distinct de um objeto
    println(data.distinctBy { it.nome }) //distinct de um atributo

    println(lst.sorted()) //Imprime em ordem crescente
    println(lst.sortedDescending()) //Imprime em ordem decrescente

    println(lst.reversed()) //Imprime a reversão do objeto



















}

fun geraDados(): List<Receita> {
    return listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 10),
                Ingrediente("Molho de tomate", 2),
                Ingrediente("Manjerição", 3)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )
        )
    )
}


data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf())
data class Ingrediente(val nome: String, val quantidade: Int)
data class ReceitaNIngredientes(val nome: String, val nIngrediente: Int)
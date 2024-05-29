package f.orientacaoabjetos.classe.`05-classes_enum`


// O enum limita o intervalo de valores
// Evitando assim testes
enum class Prioridade {
    Baixa, Media, Alta
}
// Criando com Chaves e valor
enum class NotaDeReferencia(val nota : Int){
    Baixa(1),
    Media(6),
    Alta(10)
}

// Criando com toString()
// Para personalizar o ENUM de Cachorro
enum class AnimalEnum(val char : Char) {
    Cachorro('C'){
        override fun toString(): String {
            return "Cachorrinho"
        }
    },
    Gato('G'),
    Cavalo('A'),
    Vaca('V')
}

fun main(){
   for (p in Prioridade.values()){
       if (p == Prioridade.Alta){
        println(p)
       }
   }

   for (x in NotaDeReferencia.values()){
       println(x)
   }

   for (a in AnimalEnum.values()){
       println(a)
   }
}
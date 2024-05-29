package d.excecoesnullsafety

fun main(){

    val str: String? = null

    if (str != null){
        str.lowercase()
        str.length
    }

    //Só executa se o str for diferente de nulo
    // Com isso eu removo o if e deixo o kotlin tratar
    str?.let {
        //corpo
        //scope function
        it.length
        it.lowercase()
    }
}
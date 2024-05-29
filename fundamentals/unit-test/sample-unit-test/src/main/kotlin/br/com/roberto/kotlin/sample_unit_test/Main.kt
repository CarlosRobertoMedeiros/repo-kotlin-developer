fun main() {
    println(countXO("xxoo"))
    println(countXO("xxooo"))
    println(countXO("aa"))
}

fun maiorDeIdade(idade: Int): Boolean{

    if (idade< 18){
        return false
    }else{
        return true
    }
}
fun countXO(str :String):Boolean{
    val strLower = str.lowercase()

    var i=0
    var countX=0
    var countO=0

    while (i < strLower.length){
        if(strLower[i]=='x'){
            countX++
        }else if(strLower[i]=='o'){
            countO++
        }
        i++
    }
    return countO == countX && countO !=0
}

fun abc():Boolean{
    return true
}

fun abcd(){
    throw NullPointerException()
}
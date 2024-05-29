package c.controledefluxo

fun main(){
    val s = readLine()

    //null => Variável declarada não instanciada
    if (s!=null && s!=""){
        s.toInt()
        s.toFloat()
        s.toBoolean()
    }
}
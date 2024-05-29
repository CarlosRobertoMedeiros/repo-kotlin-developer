package d.excecoesnullsafety

import java.lang.ArithmeticException

fun main(){
    implementandotrycatch()
}

fun implementandotrycatch(){
    try {
        val s: String? = null
        println(s!!.length) //Assumindo o nullPointer
        val a = 10 /0
    } catch (e:NullPointerException){
        println("Variável Nula")
    }catch (e: ArithmeticException){
        println("Impossível Dividir por Zero")
    }catch (e: Exception){
        println("Exceção Genérica")

    }finally {
        println("Vai Sempre executar pós catch")
    }
}
package br.com.roberto.solid.srp.violation

data class Order (
    val id: String,
    val description:String,
    val customerName:String,
    val customerEmail:String,
    val items:List<String> = mutableListOf()
){
    fun isValid():Boolean {
        return true;
    }
}
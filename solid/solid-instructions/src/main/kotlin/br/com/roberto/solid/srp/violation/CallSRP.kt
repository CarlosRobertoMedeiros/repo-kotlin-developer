package br.com.roberto.solid.srp.violation

fun main(){
    // Process sample with violation
    val order = Order("1","Roberto Order","Carlos Roberto","idontknow@gmail.com", mutableListOf());
    val processor = OrderProcessor()
    processor.process(order);
}
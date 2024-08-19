package br.com.roberto.solid.srp.solution

fun main(){
    // Process sample with solution
    val order = Order("1","Roberto Order","Carlos Roberto","idontknow@gmail.com", mutableListOf());
    val processor = OrderProcessor()
    processor.process(order);
}
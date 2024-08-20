package br.com.roberto.solid.ocp.solution

fun main(){
    // Process sample with OCP Solution
    val order = Order("1","Roberto Order","Carlos Roberto","idontknow@gmail.com", mutableListOf());
    val processor = OrderProcessorVerification()
    processor.process(order);
}
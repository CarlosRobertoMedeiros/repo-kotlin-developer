package br.com.roberto.solid.ocp.solution

class OrderProcessorVerification : OrderProcessor() {
    override fun process(order: Order) : Order {
        //Implementing Before Processor
        if (!order.hasItems()) {
            throw RuntimeException("Is not possible continue! Order has no itens");
        }

        super.process(order)

        //Implementing after Processor
        if (!order.isValid()) {
            throw RuntimeException("Is not possible continue! Order has no Id");
        }
        return order
    }
}
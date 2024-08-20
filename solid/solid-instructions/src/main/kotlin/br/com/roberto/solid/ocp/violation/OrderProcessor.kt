package br.com.roberto.solid.ocp.violation

class OrderProcessor {
    //This class is closed to alteration and open to extension
    // The OCP violation is that was implemented the parts "Implementing Before Processor" and "Implementing after Processor"
    // and these parts cant be has alterations
    fun process(order: Order) : Order{
        val postgresRepository = PostgresRepository()
        val sendEmail = SendEmail()

        //Implementing Before Processor
        if (!order.hasItems()){
            throw RuntimeException("Is not possible continue! Order has no itens");
        }


        //Bussiness Logic Implementation
        //................................................................
        //................................................................
        //................................................................
        //End Bussiness Logic Implementation

        //Implementing after Processor
        if (!order.isValid()){
            throw RuntimeException("Is not possible continue! Order has no Id");
        }

        postgresRepository.save(order);
        sendEmail.sendConfirmationEmail(order)
        return order;
    }




}
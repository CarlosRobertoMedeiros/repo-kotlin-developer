package br.com.roberto.solid.ocp.solution

open class OrderProcessor {
    open fun process(order: Order) : Order{
        val postgresRepository = PostgresRepository()
        val sendEmail = SendEmail()

        //Bussiness Logic Implementation
        //................................................................
        //................................................................
        //................................................................
        //End Bussiness Logic Implementation

        postgresRepository.save(order);
        sendEmail.sendConfirmationEmail(order)
        return order;
    }




}
package br.com.roberto.solid.srp.violation

class OrderProcessor {
    fun process(order: Order) : Order{
        //Bussiness Logic Implementation
        //................................................................
        //................................................................
        //................................................................
        //End Bussiness Logic Implementation

        val isPersisted = save(order);

        if (order.isValid() && isPersisted) {
            sendConfirmationEmail(order);
        }
        return order;
    }

    private fun save(order: Order):Boolean{
        val dbConnection = PostGresConnection().connect("urlConnection");
        return true
    }

    private fun sendConfirmationEmail(order: Order):Unit{
        val smtp = SmtpGmail("myEmailUserSmtp", "myEmailPasswordSmtp")
        val customer = order.customerName;
        val email = order.customerEmail;

        val html = "Dear ${customer} , your Order ${order.id} is in processing !!";
        smtp.send(html, email);
    }
}
package br.com.roberto.solid.ocp.violation

class SendEmail {
    fun sendConfirmationEmail(order: Order):Unit{
        val smtp = SmtpGmail("myEmailUserSmtp", "myEmailPasswordSmtp")
        val customer = order.customerName;
        val email = order.customerEmail;

        val html = "Dear ${customer} , your Order ${order.id} is in processing !!";
        smtp.send(html, email);
    }
}
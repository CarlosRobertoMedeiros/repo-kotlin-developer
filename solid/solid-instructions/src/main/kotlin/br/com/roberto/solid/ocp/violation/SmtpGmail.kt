package br.com.roberto.solid.ocp.violation

data class SmtpGmail(
    val user:String,
    val password: String,
){
    fun configure(){
        // Configure and conection in smtp
        println("Testing Connection Information with user: ${this.user} and with password: ${this.password}")
    }

    fun send(html:String, email:String){
        println("Send Email for: ${email} With: ${html}")
    }
}
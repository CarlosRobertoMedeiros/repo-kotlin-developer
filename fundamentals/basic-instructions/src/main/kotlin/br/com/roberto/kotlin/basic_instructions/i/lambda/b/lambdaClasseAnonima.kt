package i.lambda.b

interface EventListener {
    fun click()
}

class Form {
    fun clickKotlin(e: EventListener){}
    fun clickJava(e: EventListenerJava){}
}
class Main{
    private val name = "kotlin"
    fun main() {
        // SAM Conversion - Single Abstract Method
        Form().clickJava {
            this.name
            println("Hello")
        }


        Form().clickKotlin( object : EventListener {
            override fun click() {
                //this.name  -> Para Metodo em classe anônima não tem
                TODO("Not yet implemented")
            }

        })

    }
}
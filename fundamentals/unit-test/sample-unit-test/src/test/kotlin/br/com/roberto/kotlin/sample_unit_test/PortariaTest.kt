import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class PortariaTest{

    @Test
    @DisplayName("Testa os cenarios da portaria")
    fun testaPortaria(){
        Assertions.assertEquals(portaria(15,"",""),"Negado.")
        Assertions.assertEquals(portaria(20,"",""),"Negado.")
        Assertions.assertEquals(portaria(25,"VIP",""),"Negado.")
        Assertions.assertEquals(portaria(25,"comum","xt564"),"Welcome.")
        Assertions.assertEquals(portaria(25,"comum","564"),"Negado.")
        Assertions.assertEquals(portaria(25,"premium","xl564"),"Welcome.")
        Assertions.assertEquals(portaria(25,"premium","564"),"Negado.")
        Assertions.assertEquals(portaria(25,"premium","xt564"),"Negado.")
        Assertions.assertEquals(portaria(25,"premium","564"),"Negado.")
        Assertions.assertEquals(portaria(25,"premium","xl564"),"Welcome.")
        Assertions.assertEquals(portaria(25,"luxo","xl564"),"Welcome.")
    }

}



import org.junit.jupiter.api.*

class MainTest{

    @Test
    @DisplayName("Teste metodo xxoo")
    fun testCountXO(){
        Assertions.assertTrue(countXO("xxoo"))
        Assertions.assertFalse(countXO("abcd"))
        Assertions.assertEquals(countXO("xxoo"),true)

        // Exemplo de usabilidade de vários metodos de teste rodando
        // e mostrando erro. A diferença é que aqui ele testa todos e não
        // para inidividualmente
        Assertions.assertAll(
            {Assertions.assertTrue(countXO("xxoo"))},
            {Assertions.assertEquals(countXO("xxoo"),true)}
        )
    }

    @Test
    @Disabled
    fun naoImplementado(){
        // TODO: Método ainda não implementado
    }

    @Test
    fun vaiFalhar(){
        fail("Não posso terminar os testes sem esse método")
    }

    @Test
    fun assumption(){
        //'assumption' quer  dizer assumir algo
        //Só vou rodar o teste Assertions.assertTrue(abc())
        //Assumindo que o countXO("xxoo") é true
        // Se mudar o valor do countXO("xxo") ele não vai assumir e
        // Não vai pra frente pois a condição não foi satisfeita
        Assumptions.assumeTrue(countXO("xxoo"))
        Assertions.assertTrue(abc())

    }

    @Test
    fun exception(){
        assertThrows<NullPointerException> {abcd()}
    }

    @Test
    fun testaFuncionalidadeMaiorDeIdade(){
        //Obs olhar que não foi coberto o caso de if e sim
        //o Else
        Assertions.assertTrue(maiorDeIdade(29))


    }


}


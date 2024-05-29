package f.orientacaoabjetos.classe.`09-heranca`.`01-Conta`

fun main(){
    val contaPoupanca: Conta = ContaPoupanca("123456", 1000.0, 0.05)
    val contaCorrente: Conta = ContaCorrente("987654", 2000.0, 10.0)

    println("Conta Poupança:")
    contaPoupanca.depositar(500.0)
    contaPoupanca.sacar(200.0)
    contaPoupanca.mostrarSaldo()

    println("\nConta Corrente:")
    contaCorrente.depositar(300.0)
    contaCorrente.sacar(2500.0)
    contaCorrente.mostrarSaldo()
}


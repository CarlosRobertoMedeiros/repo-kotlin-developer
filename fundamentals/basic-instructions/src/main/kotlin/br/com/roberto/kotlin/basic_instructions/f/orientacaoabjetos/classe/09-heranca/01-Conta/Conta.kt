package f.orientacaoabjetos.classe.`09-heranca`.`01-Conta`

open class Conta(val numeroConta: String, var saldo: Double) {
    open fun depositar(valor: Double) {saldo+=valor}
    open fun sacar(valor: Double) {
        if (saldo<valor) println("Saldo insuficiente para realizar o saque.")
        else  saldo-=valor
    }
    open fun mostrarSaldo(){println("Saldo atual da conta $numeroConta: $saldo")}
}
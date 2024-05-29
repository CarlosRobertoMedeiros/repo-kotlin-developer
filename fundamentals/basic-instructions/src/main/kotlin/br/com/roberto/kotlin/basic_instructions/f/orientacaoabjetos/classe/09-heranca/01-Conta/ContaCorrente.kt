package f.orientacaoabjetos.classe.`09-heranca`.`01-Conta`

class ContaCorrente(numeroConta: String, saldo: Double, val taxaManutencao: Double) : Conta(numeroConta, saldo) {
    override fun depositar(valor: Double) {
        super.depositar(valor)
        aplicarTaxaManutencao()
    }

    private fun aplicarTaxaManutencao() {
        saldo -= taxaManutencao
        println("Taxa de manutenção aplicada. Novo saldo: $saldo")
    }
}
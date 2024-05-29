package c.controledefluxo

fun main(){

    /*
    Ana e Paula são duas programadoras da empresa XDM. A empresa possui um benefício para incentivar os funcionários
    a pouparem dinheiro para a aposentadoria que funciona da seguinte maneira:
      Se o funcionario destinar 5% do salario para investimento, a empresa acrescenta os mesmos 5%
      Ou seja, caso o funcionario invista 100 reais, a empresa investe mais 100.
      Este fundo de investimento possui rendimento de 0,2% ao mês

      Ana adorou a idéia e vai investir. No entando, Paula decidiuque vai investir os mesmos 5% por conta própria
      já que conhece de investimentos que rendem mais que 0,2% ao mês. Paula vai escolher investimentos que rendem 0,8 ao mês
      Considere o salário de Ana e Paula iguais no valor de 10 mil reais e que as duas estão com saldo 0 e que investirão
      5% do salário.
      Em quantos meses o Patrimônio de Paula vai superar o Patrimônio de Ana ?
     */
    val salario = 10000f

    var patAna = 0f
    var patPaula = 0f
    var mes = 1

    do {
        patAna += (salario * 0.05f + salario * 0.05f + patAna * 0.002f)
        patPaula += (salario * 0.05 + patPaula * 0.008).toFloat()
        mes++
    } while (patAna > patPaula)

    println("Paula vai ultrapassar o patrimônio de Ana no mês $mes.")
}
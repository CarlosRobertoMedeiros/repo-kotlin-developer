import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

fun String.transformarEmIdade(): Int {
    val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
    val dataNascimento = LocalDate.parse(this, formatter)
    val hoje = LocalDate.now()
    val idade = Period.between(dataNascimento, hoje).years
    return idade
}
import kotlin.math.pow

fun calculateCompoundInterest(amount: Int = 1000, percent: Int = 5, years: Int = 10): Int {
    return (amount * (1.0 + (percent / 100.0)).pow(years)).toInt()
}

fun main() {
    val parameter = readln()
    val value = readln().toInt()

    when(parameter) {
        "amount" -> print(calculateCompoundInterest(amount = value))
        "percent" -> print(calculateCompoundInterest(percent = value))
        "years" -> print(calculateCompoundInterest(years = value))
    }
}
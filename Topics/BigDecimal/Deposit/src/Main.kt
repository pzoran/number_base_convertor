import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    // write your code here
    val startingAmount = readln().toBigDecimal().setScale(8, RoundingMode.CEILING)
    val yearlyPercent = readln().toBigDecimal().setScale(4, RoundingMode.CEILING)
    val years = readln().toInt()
    val finalAmount = startingAmount * (BigDecimal.ONE + yearlyPercent / BigDecimal("100")).pow(years)

    println("Amount of money in the account: ${finalAmount.setScale(2, RoundingMode.CEILING)}")
}
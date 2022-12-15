import java.math.BigDecimal
import java.math.RoundingMode

fun main() {             
    // write your code here
    val input = readln()
    val newScale = readln().toInt()

    println(BigDecimal(input).setScale(newScale, RoundingMode.HALF_DOWN))
}
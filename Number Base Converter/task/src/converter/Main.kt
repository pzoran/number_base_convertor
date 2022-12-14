package converter


import java.math.BigDecimal
import java.math.BigInteger
import java.math.MathContext
import java.math.RoundingMode


// Do not delete this line

const val charset = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"

fun fromIntegralPartOfDecimalNumber(targetBase: String, decimalNumber: String): String {
    if (decimalNumber == "0") return "0"

    var number = decimalNumber.toBigInteger()
    val base = targetBase.toBigInteger()
    var result = ""

    while (number > BigInteger.ZERO) {
        val (divider, remainder) = number.divideAndRemainder(base)
        result += charset[remainder.toInt()]
        number = divider
    }

    return result.reversed()
}

fun fromFractionalPartOfDecimalNumber(targetBase: String, decimalNumber: String): String {
    if (decimalNumber == "0" || decimalNumber == "00000") return "00000"

    var number = decimalNumber
    val base = targetBase.toBigDecimal()
    var result = ""

    while (result.length < 5) {
        val iteration = BigDecimal("0.$number") * base
        val integralPart = iteration.toString().substringBefore(".").toInt()
        val decimalPart = iteration.toString().substringAfter(".")
        result += charset[integralPart]
        number = decimalPart
    }

    return if (result.length < 5) result + "0".repeat(5 - result.length) else result
}

fun fromFractionalDecimalNumber(targetBase: String, number: String): String {
    return fromIntegralPartOfDecimalNumber(targetBase, number.substringBefore(".")) + "." +
            fromFractionalPartOfDecimalNumber(targetBase, number.substringAfter("."))
}

fun toIntegralPartOfDecimalNumber(sourceBase: String, sourceNumber: String): String {
    val number = sourceNumber.reversed()
    val base = sourceBase.toBigInteger()
    var result: BigInteger = BigInteger.ZERO

    for (i in number.indices) {
        val digit = number[i].toString().uppercase()
        val value = charset.indexOf(digit).toBigInteger()
        result += value * base.pow(i)
    }

    return result.toString()
}

fun toFractionalPartOfDecimalNumber(sourceBase: String, sourceNumber: String): String {
    if (sourceNumber == "0" || sourceNumber == "0000") return "00000"

    val base = sourceBase.toBigDecimal()
    var result: BigDecimal = BigDecimal.ZERO

    for (i in sourceNumber.indices) {
        val digit = sourceNumber[i].toString().uppercase()
        val value = charset.indexOf(digit).toBigDecimal()
        result += value * base.pow(-(i + 1), MathContext.DECIMAL64)
    }

    return result.setScale(5, RoundingMode.HALF_UP).toString().substringAfter(".")
}

fun toFractionalDecimalNumber(targetBase: String, number: String): String {
    return toIntegralPartOfDecimalNumber(targetBase, number.substringBefore(".")) + "." +
            toFractionalPartOfDecimalNumber(targetBase, number.substringAfter("."))
}

fun doConversion(sourceBase: String, targetBase: String, number: String) {
    val conversionResult: String = if (sourceBase == "10") {
        when {
            number.contains(".") -> fromFractionalDecimalNumber(targetBase, number)
            else -> fromIntegralPartOfDecimalNumber(targetBase, number)
        }
    } else if (targetBase == "10") {
        when {
            number.contains(".") -> toFractionalDecimalNumber(sourceBase, number)
            else -> toIntegralPartOfDecimalNumber(sourceBase, number)
        }
    } else {
        when {
            number.contains(".") -> {
                val decimalNumber = toFractionalDecimalNumber(sourceBase, number)
                fromFractionalDecimalNumber(targetBase, decimalNumber)
            }
            else -> {
                val decimalNumber = toIntegralPartOfDecimalNumber(sourceBase, number)
                fromIntegralPartOfDecimalNumber(targetBase, decimalNumber)
            }
        }
    }

    println("Conversion result: $conversionResult")
}

fun enterNumber(input: String) {
    val (sourceBase, targetBase) = input.split(" ")
    while (true) {
        print("Enter number in base $sourceBase to convert to base $targetBase (To go back type /back) > ")
        when (val number = readln()) {
            "/back" -> return
            else -> doConversion(sourceBase, targetBase, number)
        }
    }
}

fun main() {
    while (true) {
        print("Enter two numbers in format: {source base} {target base} (To quit type /exit) > ")

        when (val input = readln()) {
            "/exit" -> return
            else -> enterNumber(input)
        }
    }
}

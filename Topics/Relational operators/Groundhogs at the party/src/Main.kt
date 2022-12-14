fun main() {
    val butterCups = readln().toInt()
    val isWeekend = readln().toBoolean()

    println((!isWeekend && ((butterCups >= 10) && (butterCups <= 20))) ||
            (isWeekend && ((butterCups >= 15) && (butterCups <= 25)))
    )
}
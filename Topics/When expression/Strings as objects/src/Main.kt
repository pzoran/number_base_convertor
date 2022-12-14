fun main() {
    val input = readLine()!!
    when {
        input.isEmpty() -> println("")
        input.first() == 'i' -> {
            var number = input.drop(1).toInt()
            println(++number)
        }
        input.first() == 's' -> {
            println(input.drop(1).reversed())
        }
        else -> println(input)
    }
}
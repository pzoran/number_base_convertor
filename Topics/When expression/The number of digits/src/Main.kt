fun main() {
    val number = readln().toInt()
    when {
        (number / 10) == 0 -> println(1)
        (number / 100) == 0 -> println(2)
        (number / 1000) == 0 -> println(3)
        (number / 10000) == 0 -> println(4)
    }
}
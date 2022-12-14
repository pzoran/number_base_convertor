fun main() {
    val line1 = readln()
    val line2 = readln()

    val product = line1.toInt() * line2.toInt()
    if (product == 0) {
        println("It can't be zero!")
    } else {
        println(product)
    }
}
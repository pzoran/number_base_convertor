fun main() {
    // put your code here
    val input = readln()
    val firstChar = input.first()
    val lastChar = input.last()
    val body = input.substring(1, input.length - 1)

    println("$lastChar$body$firstChar")
}
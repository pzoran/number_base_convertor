fun main() {
    // put your code here
    val a = readln().toLong()
    val b = readln().toLong()

    var result = 1L
    for (number in a until b) {
        result *= number
    }

    println(result)
}

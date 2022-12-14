fun main() {
    val n = readln().toInt()
    var square = 1
    var i = 2

    while (square <= n) {
        println(square)
        square = i * i
        i++
    }
}
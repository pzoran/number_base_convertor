fun main() {
    var n = readln().toInt()
    var max = n

    while (n > 0) {
        n = readln().toInt()
        if (n > max) {
            max = n
        }
    }

    println(max)
}
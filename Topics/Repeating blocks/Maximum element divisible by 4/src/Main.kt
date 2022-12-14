fun main() {
    var sequence = readln().toInt()
    var max = 0U

    repeat(sequence) {
        val n = readln().toUInt()
        if ((n % 4U == 0U) && (n > max)) {
            max = n
        }
    }

    println(max)
}
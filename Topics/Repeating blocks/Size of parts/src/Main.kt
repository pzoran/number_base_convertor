fun main() {
    val sequence = readln().toInt()
    var perfectCount = 0
    var largerCount = 0
    var smallerCount = 0

    repeat(sequence) {
        val n = readln().toInt()
        if (n > 0) {
            largerCount++
        } else if (n < 0) {
           smallerCount++
        } else {
            perfectCount++
        }
    }

    println("$perfectCount $largerCount $smallerCount")
}
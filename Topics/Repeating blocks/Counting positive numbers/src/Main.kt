fun main() {
    val sequence = readln().toInt()
    var positiveCount = 0

    repeat(sequence) {
        val n = readln().toInt()
        if(n > 0) {
            positiveCount++
        }
    }

    println(positiveCount)
}
fun main() {
    // write your code here
    val n = readln().toInt()
    var maxNumber = readln().toInt()
    var count = 1
    var lastMaxCount = 1

    for (i in 1 until n) {
        val input = readln().toInt()
        if (input >= maxNumber) {
            maxNumber = input
            count++
        } else {
            maxNumber = input
            if (lastMaxCount < count) lastMaxCount = count
            count = 1
        }
    }

    if (lastMaxCount < count) lastMaxCount = count

    println(lastMaxCount)
}
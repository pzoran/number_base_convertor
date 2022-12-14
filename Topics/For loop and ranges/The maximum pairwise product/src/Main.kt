fun main() {
    // write your code here
    val size = readln().toInt()
    var firstBiggest = 1U
    var secondBiggest = 1U

    for (it in 1..size) {
        val value = readln().toUInt()
        if (value > firstBiggest && firstBiggest <= secondBiggest) {
            firstBiggest = value
        } else if (value > secondBiggest) {
            secondBiggest = value
        } else {
            // Do nothing
        }
    }

    print(firstBiggest * secondBiggest)
}

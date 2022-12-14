fun main() {
    // write your code here
    val input = readln().lowercase()
    var lettersCount = 0

    for (char in input) {
        if (char == 'g' || char == 'c') {
            lettersCount++
        }
    }

    println("${lettersCount.toDouble() / input.length * 100}")
}
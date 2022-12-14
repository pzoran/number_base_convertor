fun main() {
    // write your code here
    var sum = 0
    val size = readln().toInt()

    for (number in 1..size) {
        sum += readln().toInt()
    }

    println(sum)
}

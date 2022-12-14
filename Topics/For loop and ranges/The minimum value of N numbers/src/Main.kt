fun main() {
    // write your code here
    val size = readln().toInt()
    var minimum = readln().toInt()

    for (number in 2..size) {
        var input = readln().toInt()
        if (input < minimum) minimum = input
    }

    println(minimum)
}

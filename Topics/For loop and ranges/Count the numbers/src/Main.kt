fun main() {
    // put your code here
    val start = readln().toInt()
    val end = readln().toInt()
    val n = readln().toInt()
    var sum = 0
    
    for (number in start..end) {
        if (number % n == 0) ++sum
    }

    println(sum)
}

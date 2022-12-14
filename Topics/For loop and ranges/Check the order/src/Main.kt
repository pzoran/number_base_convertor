fun main() {
    // write your code here
    val n = readln().toInt()
    var min = Int.MIN_VALUE
    var result = "YES"
    
    for (it in 1..n) {
        val value = readln().toInt()
        if (value < min) {
            result = "NO"
            break
        }
        min = value
    }

    println(result)
}

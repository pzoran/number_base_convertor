fun main() {
    var sum = 0
    var n = readln().toInt()

    while(n > 0) {
        sum += n
        n = readln().toInt()
    }

    println(sum)
}
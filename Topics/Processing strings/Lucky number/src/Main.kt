fun main() {
    // write your code here
    val number = readln()
    var firstPartSum = 0
    var secondPartSum = 0

    for (i in 0 until number.length / 2) {
        firstPartSum += number[i].toInt()
    }

    for (i in number.length / 2 until number.length) {
        secondPartSum += number[i].toInt()
    }

    println(if (firstPartSum == secondPartSum) "YES" else "NO")
}
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var max = readln().toInt()
    var position = 1
    var maxPosition = 1

    while(scanner.hasNextInt()) {
        val n = readln().toInt()
        if(n > max) {
            max = n
            maxPosition = position
        }
        position++
    }
    println("$max $maxPosition")
}
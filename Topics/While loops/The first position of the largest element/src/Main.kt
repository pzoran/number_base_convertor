import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var n = Int.MIN_VALUE
    var max = n
    var maxPosition = 1
    var position = 1

    while(scanner.hasNextInt()) {
        n = scanner.nextInt()
        if (n > max) {
            max = n
            maxPosition = position
        }
        position++
    }

    println("$max $maxPosition")
}
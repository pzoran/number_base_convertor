import kotlin.math.*

fun main() {
    val (x1, y1) = readln().split(" ")
    val (x2, y2) = readln().split(" ")
    
    println(
        if (((abs(x1.toInt() - x2.toInt()) == 1) && (abs(y1.toInt() - y2.toInt()) ==2)) ||
                ((abs(x1.toInt() - x2.toInt()) == 2) && (abs(y1.toInt() - y2.toInt()) == 1))) {
            "YES"
        } else {
            "NO"
        }
    )
}
import kotlin.math.sqrt

fun main() {
    when(readln()) {
        "triangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            val c = readln().toDouble()
            val s = (a + b + c) / 2
            println(sqrt(s * (s - a) * (s - b) * (s - c)))
        }
        "rectangle" -> {
           val a = readln().toDouble()
           val b = readln().toDouble()
           println(a * b)
        }
        "circle" -> {
            val r = readln().toDouble()
            println(r * r * 3.14)
        }
    }
}
// write your code here
fun divide(a: Long, b: Long): Double {
    return if (b != 0L) {
        a.toDouble() / b.toDouble()
    } else {
        0.0
    }
}

/* Do not change code below */
fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    println(divide(a, b))
}
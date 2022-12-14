fun main() {
    val a = readLine()!!.toUInt()
    val b = readLine()!!.toUInt()
    val c = readLine()!!.toUInt()

    println(
            if (a + b > c && b + c > a && c + a > b) {
                "YES"
            } else {
                "NO"
            }
    )
}
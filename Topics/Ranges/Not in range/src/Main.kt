fun main() {
    val n = readln().toInt()
    println(
        if (n !in 1..10)
            "true"
        else
            "false"
    )
}
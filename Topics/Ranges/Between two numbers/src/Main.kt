fun main() {
    val value = readln().toInt()
    val x1 = readln().toInt()
    val x2 = readln().toInt()

    println(
        if (value in x1..x2)
            "true"
        else
            "false"
    )
}
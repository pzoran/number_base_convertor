fun main() {
    val age = readln().toInt()
    println(
        if (age in 18..59)
            "true"
        else
            "false"
    )
}
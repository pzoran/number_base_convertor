fun main() {
    val x1 = readln().toInt()
    val x2 = readln().toInt()
    val y1 = readln().toInt()
    val y2 = readln().toInt()
    val value = readln().toInt()

    println(
        if(value in x1..x2 || value in y1..y2)
            "true"
        else
            "false"
    )
}
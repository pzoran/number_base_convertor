fun checkSpeedLimit(speed: Int, limit: Int = 60) {
    println(
        if (speed <= limit) "Within the limit"
        else "Exceeds the limit by ${speed - limit} kilometers per hour"
    )
}

fun main(args: Array<String>) {
    // write your code here
    val speed = readln().toInt()
    val limit = readln()
    if (limit == "no limit") {
        checkSpeedLimit(speed)
    } else {
        checkSpeedLimit(speed, limit.toInt())
    }
}
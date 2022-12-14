fun main() {
    val hours1 = readln().toInt()
    val minutes1 = readln().toInt()
    val seconds1 = readln().toInt()
    
    val hours2 = readln().toInt()
    val minutes2 = readln().toInt()
    val seconds2 = readln().toInt()
    
    println((hours2 - hours1) * 3600 + (minutes2 - minutes1) * 60 + (seconds2 - seconds1))
}
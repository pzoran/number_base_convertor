fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
    println("${totalSeconds / 3600 % 24}:${totalSeconds % 3600 / 60}:${totalSeconds % 3600 % 60}")
}
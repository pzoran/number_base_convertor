fun main() {
    val units = readln().toInt()
        when {
            units < 1 -> println("no army")
            units in 1..4 -> println("few")
            units in 5..9 -> println("several")
            units in 10..19 -> println("pack")
            units in 20..49 -> println("lots")
            units in 50..99 -> println("horde")
            units in 100..249 -> println("throng")
            units in 250..499 -> println("swarm")
            units in 500..999 -> println("zounds")
            units >= 1000 -> println("legion")
        }
}
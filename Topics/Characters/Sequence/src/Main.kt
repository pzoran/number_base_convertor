fun main() {
    val ch1 = readln().first()
    val ch2 = readln().first()
    val ch3 = readln().first()

    println((ch1.code == ch2.code - 1) && (ch2.code == ch3.code - 1))
}
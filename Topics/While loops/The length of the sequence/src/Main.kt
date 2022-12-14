fun main() {
    var size = 0
    var n = readln().toUInt()

    while(n > 0U) {
        size++
        n = readln().toUInt()
    }
    println(size)
}
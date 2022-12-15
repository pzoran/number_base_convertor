fun main() {
    // write your code here
    val input = readln()
    val pattern = readln()
    val count = input.split(pattern).size - 1
    println(count)
}
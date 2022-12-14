// write your function here
fun isVowel(char: Char): Boolean {
    return char == 'a' || char == 'A' ||
            char == 'e' || char == 'E' ||
            char == 'i' || char == 'I' ||
            char == 'o' || char == 'O' ||
            char == 'u' || char == 'U'
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}
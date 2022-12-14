fun main() {
    val string1 = readln()
    val operation = readln()
    val string2 = readln()

    when(operation) {
        "equals" -> println("${string1 == string2}")
        "plus" -> println(string1 + string2)
        "endsWith" -> println("${string1.endsWith(string2)}")
        else -> println("Unknown operation")
    }
}
fun main() {
    // put your code here
    val from = readln().toInt()
    val to = readln().toInt()

    for (number in from..to) {
        when {
            number % 3 == 0 && number % 5 == 0 -> println("FizzBuzz")
            number % 3 == 0 -> println("Fizz")
            number % 5 == 0 -> println("Buzz")
            else -> println(number)
        } 
    }
}

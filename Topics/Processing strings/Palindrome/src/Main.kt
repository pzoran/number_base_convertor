fun main() {
    // write your code here
    val input = readln()
    var isPalindrome = "yes"
    var i = 0

    while (i <= input.length - 1 - i) {
        if (input[i] != input[input.length - 1 - i]) {
            isPalindrome = "no"
        }
        i++
    }

    println(isPalindrome)
}
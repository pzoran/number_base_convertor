fun main() {
    val n1 = readln().toInt()
    val n2 = readln().toInt()
    val n3 = readln().toInt()

    val isN1Positive = n1 > 0
    val isN2Positive = n2 > 0
    val isN3Positive = n3 > 0

    println((isN1Positive && (!isN2Positive && !isN3Positive)) ||
            (isN2Positive && (!isN1Positive && !isN3Positive)) ||
            (isN3Positive && (!isN1Positive && !isN2Positive)))
}
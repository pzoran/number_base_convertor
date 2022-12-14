fun main() {
    val n = readln().toInt()
    var d = 0;
    var c = 0;
    var b = 0;
    var a = 0;

    repeat(n) {
        val grade = readln().toInt()
        if(grade == 5) {
            a++
        } else if (grade == 4) {
            b++
        } else if (grade == 3) {
            c++
        } else {
            d++
        }
    }

    println("$d $c $b $a")
}
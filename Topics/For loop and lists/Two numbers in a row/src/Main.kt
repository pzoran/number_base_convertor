fun main() {
    // write your code here
    val size = readln().toInt()
    val list = MutableList(size) { 0 }
    
    for (i in 0 until list.size) {
        list[i] = readln().toInt()
    }
    
    val (p, m) = readln().split(" ")
    var result = "YES"
    
    for (i in 0 until list.size - 1) {
        val first = list[i]
        val second = list[i + 1]
        
        if (first == p.toInt() && second == m.toInt() || second == p.toInt() && first == m.toInt()) {
            result = "NO"
        }
    }
    
    println(result)
}

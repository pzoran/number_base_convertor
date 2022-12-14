fun main() {
    var n = readln().toInt()
    var counter = 1
    var chars = n
    while(n > 0) {
        repeat(counter) {
            if(chars > 0) {
                print("$counter ")
            }
            chars--
        }
        counter++
        n--
    }
}
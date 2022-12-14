import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    var amount = 0
    var showBalance = true
    
    while (scanner.hasNextInt()) {
        // TODO
        amount = scanner.nextInt()
        if (balance < amount) {
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $amount.")
            showBalance = false
        } else {
            balance -= amount
            showBalance = true
        }
    }
    // TODO
    if(showBalance) {
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    }
}

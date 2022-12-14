const val SPEED = 120
const val SPEED_FEE = 100
const val YEAR_FEE = 2_000
const val KM_FEE = 200
const val KM = 10_000
const val AUTO_BONUS = 1_500
const val DEFAULT_PRICE = 20_000

// complete this function, add default values
fun carPrice(old: Int = 5, kilometers: Int = 100_000, maximumSpeed: Int = 120, automatic: Boolean = false) {
    var price = DEFAULT_PRICE - YEAR_FEE * old + (maximumSpeed - SPEED) * SPEED_FEE

    if (kilometers > KM) price -= kilometers / KM * KM_FEE
    if (automatic) price += AUTO_BONUS
    println(price)
}
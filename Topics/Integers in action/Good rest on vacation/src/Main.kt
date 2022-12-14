fun main() {
    val days = readln().toUInt()
    val foodCostPerDay = readln().toUInt()
    val oneWayTicketCost = readln().toUInt()
    val hotelNightCost = readln().toUInt()

    println(foodCostPerDay * days + oneWayTicketCost * 2U + hotelNightCost * (days - 1U))
}
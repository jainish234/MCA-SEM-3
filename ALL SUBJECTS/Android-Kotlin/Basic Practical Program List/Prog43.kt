//43. An electric power distribution company charger its
//domestic customers as follows Consumption unit rate of
//charge

fun main() {
    val customerNumber: Int
    val powerConsumed: Int
    val rate: Double
    val amount: Double
    println("Enter customer number:")
    customerNumber = readLine()!!.toInt()
    println("Enter power consumed (in units):")
    powerConsumed = readLine()!!.toInt()
    when {
        powerConsumed in 0..200 -> {
            rate = 0.50
            amount = powerConsumed * rate
        }
        powerConsumed in 201..400 -> {
            rate = 0.65
            amount = 100 + (powerConsumed - 200) * rate
        }
        powerConsumed in 401..600 -> {
            rate = 0.80
            amount = 230 + (powerConsumed - 400) * rate
        }
        powerConsumed >= 601 -> {
            rate = 1.00
            amount = 390 + (powerConsumed - 600) * rate
        }
        else -> {
            println("Invalid power consumption value.")
            return
        }
    }
    println("Customer $customerNumber needs to pay Rs. $amount")
}

////output:=
//Enter customer number:
//989860
//Enter power consumed (in units):
//34
//Customer 989860 needs to pay Rs. 17.0

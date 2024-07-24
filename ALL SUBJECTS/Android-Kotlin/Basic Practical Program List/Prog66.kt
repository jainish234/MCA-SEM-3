//66. Check entered number is Armstrong or not.

fun main() {
    fun isArmstrong(number: Int): Boolean {
        val digits = number.toString().map { it.toString().toInt() }
        val power = digits.size
        val sumOfPowers = digits.map { Math.pow(it.toDouble(),
            power.toDouble()).toInt() }.sum()
        return sumOfPowers == number
    }
    val number = 600
    if (isArmstrong(number)) {
        println("$number is an Armstrong number.")
    } else {
        println("$number is not an Armstrong number.")
    }
}

//output:=
//600 is not an Armstrong number.
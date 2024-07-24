//70. Count digits of given number.
fun countDigits(number: Int): Int {
    var count = 0
    var num = number
    if (num < 0) {
        num = -num
    }
    while (num > 0) {
        num /= 10
        count++
    }
    return count
}
fun main() {
    val number = 12345
    val digitCount = countDigits(number)
    println("Number of digits in $number: $digitCount")
}

//output:=
//Number of digits in 12345: 5
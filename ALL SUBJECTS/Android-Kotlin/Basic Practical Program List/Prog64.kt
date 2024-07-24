//64. Display sum of digit.

fun main() {
    val number = 12345
    var sum = 0
    var n = number
    while (n != 0) {
        sum += n % 10
        n /= 10
    }
    println("Sum of digits of $number is: $sum")
}

//output:=
//Sum of digits of 12345 is: 15
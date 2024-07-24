//61. Check whether the number is prime or not.
fun main() {
    val number = 102
    var isPrime = true
    if (number <= 1) {
        isPrime = false
    } else {
        for (i in 2 until number) {
            if (number % i == 0) {
                isPrime = false
                break
            }
        }
    }
    if (isPrime) {
        println("$number is a prime number.")
    } else {
        println("$number is not a prime number.")
    }
}

//output:=
//102 is not a prime number.
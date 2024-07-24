//60. Print factorial value of given number.

fun main() {
    val number = 5
    var factorial = 1
    for (i in 1..number) {
        factorial *= i
    }
    println("Factorial of $number = $factorial")
}

//output:=
//Factorial of 5 = 120
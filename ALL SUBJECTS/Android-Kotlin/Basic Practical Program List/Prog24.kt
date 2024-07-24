//24. Write a program to find out minimum number from 2 numbers.

fun main() {
    val number1 = 90
    val number2 = 43
    val minNumber = if (number1 < number2) {
        number1
    } else {
        number2
    }
    println("Minimum number $number1 and $number2 is: $minNumber")
}

//output:=
//Minimum number 90 and 43 is: 43


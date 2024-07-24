//25. Write a program to find minimum and maximum no from 2 numbers.

fun main() {
    val number1 = 20
    val number2 = 9
    val minNumber = if (number1 < number2) {
        number1
    } else {
        number2
    }
    val maxNumber = if (number1 > number2) {
        number1
    } else {
        number2
    }
    println("numbers: $number1 and $number2")
    println("Minimum number: $minNumber")
    println("Maximum number: $maxNumber")
}

//output:=
//numbers: 20 and 9
//Minimum number: 9
//Maximum number: 20

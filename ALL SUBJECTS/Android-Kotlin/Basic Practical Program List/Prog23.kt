//23. Write a program to find maximum number from 2 numbers.

fun main() {
    val number1 = 88
    val number2 = 54
    val maxNumber = if (number1 > number2) {
        number1
    } else {
        number2
    }
    println("Maximum number $number1 and $number2 is: $maxNumber")
}

//output:=
//Maximum number 88 and 54 is: 88
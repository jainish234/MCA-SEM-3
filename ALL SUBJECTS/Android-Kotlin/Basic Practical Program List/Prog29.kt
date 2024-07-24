//29.Write a program that accept the number from user and check its
//negative, positive or zero.

fun main() {
    print("Enter a number: ")
    val number = readLine()?.toDoubleOrNull()
    if (number != null) {
        when {
            number > 0 -> println("The number is positive.")
            number < 0 -> println("The number is negative.")
            else -> println("The number is zero.")
        }
    } else {
        println("Invalid input. Please enter a valid number.")
    }
}

//output:=
//Enter a number: 88
//The number is positive.
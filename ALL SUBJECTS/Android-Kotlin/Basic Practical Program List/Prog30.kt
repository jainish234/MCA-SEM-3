//30.Write a program input one integer number. Check whether
//number is equal to 10 or not.

fun main() {
    println("Please enter an integer number:")
    val number = readLine()?.toIntOrNull()
    if (number == null) {
        println("Invalid input. Please enter a valid integer.")
    } else if (number == 10) {
        println("The number is equal to 10.")
    } else {
        println("The number is not equal to 10.")
    }
}

//output:=
//Please enter an integer number:
//87
//The number is not equal to 10.

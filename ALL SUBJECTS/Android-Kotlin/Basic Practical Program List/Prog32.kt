//32. Write a program input one integer number check whether number
//is four digits or not.

fun main() {
    println("Enter an integer number:")
    val number = readLine()?.toIntOrNull()
    if (number != null && number in 1000..9999) {
        println("The number $number is a four-digit number.")
    } else {
        println("The number is not a four-digit number.")
    }
}

//output:=
//Enter an integer number:
//8976
//The number 8976 is a four-digit number.
//33. Write a program input one integer number check whether is greater than 50 and less then 200.

fun main() {
    print("Enter an integer number: ")
    val number = readLine()?.toIntOrNull()
    if (number != null) {
        if (number > 50 && number < 200) {
            println("$number is greater than 50 and less than 200.")
        } else {
            println("$number is not in the range ")
        }
    } else {
        println("Invalid input. Please enter a valid integer.")
    }
}

//output:=
//Enter an integer number: 87
//87 is greater than 50 and less than 200.
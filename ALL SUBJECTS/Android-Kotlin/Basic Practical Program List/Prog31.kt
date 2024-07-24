//31.Write a program input one integer number check whether
//number is in between 0 to 100 or not.

fun main() {
    print("Enter an integer number: ")
    val number = readLine()?.toIntOrNull()
    if (number != null) {
        if (number in 0..100) {
            println("$number is between 0 and 100.")
        } else {
            println("$number is not between 0 and 100.")
        }
    }
}

//output:=
//Enter an integer number: 87
//87 is between 0 and 100.
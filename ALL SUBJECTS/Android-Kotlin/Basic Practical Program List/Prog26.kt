//26. Write a program to check number is odd or even.

fun main() {
    println("Enter a number:")
    val number = readLine()!!.toInt()
    if (number % 2 == 0) {
        println("$number is even.")
    } else {
        println("$number is odd.")
    }
}

//output:=
//Enter a number:
//99
//99 is odd.
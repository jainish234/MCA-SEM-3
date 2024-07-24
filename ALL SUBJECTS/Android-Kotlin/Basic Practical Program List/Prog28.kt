//28. Write a program to that accept the number from user and check it
//is divisible by 5 or not.

fun main() {
    println("Enter a number:")
    val number = readLine()!!.toInt()
    if (number % 5 == 0) {
        println("$number is divisible by 5.")
    } else {
        println("$number is not divisible by 5.")
    }
}

//output:=
//Enter a number:
//70
//70 is divisible by 5.
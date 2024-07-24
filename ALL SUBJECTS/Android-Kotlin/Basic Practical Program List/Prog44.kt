//44. Get a string from user and display it in upper case.

import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter a string: ")
    val inputString = scanner.nextLine()
    val upperCaseString = inputString.toUpperCase()
    println("String in uppercase: $upperCaseString")
}

//output
//Enter a string: hi hello how are you
//String in uppercase: HI HELLO HOW ARE YOU
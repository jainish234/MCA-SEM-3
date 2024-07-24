//45. Get a string from user and display it in lower case

import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter a string: ")
    val inputString = scanner.nextLine()
    val lowerCaseString = inputString.toLowerCase()
    println("String in uppercase: $lowerCaseString")
}

//output:=
//Enter a string: HI HELLO ARE YOU
//String in uppercase: hi hello are you
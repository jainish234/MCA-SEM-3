//55. Input and number display table of that number.

import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter a number: ")
    val number = scanner.nextInt()
    println("Multiplication table of $number:")
    for (i in 1..10) {
        println("$number * $i = ${number * i}")
    }
}

//output:=
//Enter a number: 7
//Multiplication table of 7:
//7 * 1 = 7
//7 * 2 = 14
//7 * 3 = 21
//7 * 4 = 28
//7 * 5 = 35
//7 * 6 = 42
//7 * 7 = 49
//7 * 8 = 56
//7 * 9 = 63
//7 * 10 = 70


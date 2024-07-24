//18. Write a program to read the value of X and Y and print the
//result of following expression 3X2+2XY+3Y2

import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter the value of X:")
    val X = scanner.nextDouble()
    println("Enter the value of Y:")
    val Y = scanner.nextDouble()
    val result = 3 * X * X + 2 * X * Y + 3 * Y * Y
    println("Result of the expression 3X^2 + 2XY + 3Y^2 is: $result")
}

//output:=
//Enter the value of X:
//22
//Enter the value of Y:
//24
//Result of the expression 3X^2 + 2XY + 3Y^2 is: 4236.0
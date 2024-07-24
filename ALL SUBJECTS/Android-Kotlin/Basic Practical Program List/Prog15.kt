//15.Write a program to read the value of X and Y and print the
//result of following expression (X+Y)/(X-Y).
import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter the value of X:")
    val x = scanner.nextDouble()
    println("Enter the value of Y:")
    val y = scanner.nextDouble()
    val result = (x + y) / (x - y)
    println("Result of (X + Y) / (X - Y) = $result")
}

//output:=
//Enter the value of X:
//99
//Enter the value of Y:
//88
//Result of (X + Y) / (X - Y) = 17.0

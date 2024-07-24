//39. Write a program input integer number and select number to
//perform following task
//1- Addition
//2- Subtraction
//3- Multiplication
//4- Division
//5- Exit

import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    while (true) {
        println("\nMenu:")
        println("1. Addition")
        println("2. Subtraction")
        println("3. Multiplication")
        println("4. Division")
        println("5. Exit")
        print("Enter your choice: ")
        val choice = scanner.nextInt()
        if (choice == 5) {
            break
        }
        print("Enter the first number: ")
        val num1 = scanner.nextInt()
        print("Enter the second number: ")
        val num2 = scanner.nextInt()
        when (choice) {
            1 -> println("Result: ${num1 + num2}")
            2 -> println("Result: ${num1 - num2}")
            3 -> println("Result: ${num1 * num2}")
            4 -> {
                if (num2 != 0) {
                    println("Result: ${num1.toDouble() / num2}")
                } else {
                    println("Error: Division by zero!")
                }
            }
            else -> println("Invalid choice. Please enter a number from 1 to5.")
        }
    }
    println("Exiting the program.")
}

//output:
//Menu:
//1. Addition
//2. Subtraction
//3. Multiplication
//4. Division
//5. Exit
//Enter your choice: 1
//Enter the first number: 22
//Enter the second number: 33
//Result: 55
//
//Menu:
//1. Addition
//2. Subtraction
//3. Multiplication
//4. Division
//5. Exit
//Enter your choice: 2
//Enter the first number: 99
//Enter the second number: 44
//Result: 55
//
//Menu:
//1. Addition
//2. Subtraction
//3. Multiplication
//4. Division
//5. Exit
//Enter your choice: 3
//Enter the first number: 5
//Enter the second number: 6
//Result: 30
//
//Menu:
//1. Addition
//2. Subtraction
//3. Multiplication
//4. Division
//5. Exit
//Enter your choice: 4
//Enter the first number: 66
//Enter the second number: 6
//Result: 11.0
//
//Menu:
//1. Addition
//2. Subtraction
//3. Multiplication
//4. Division
//5. Exit
//Enter your choice: 5
//Exiting the program.
//


//63. Write program that display square, cubes and factorials of all
//integer from 1 to 10.

fun main() {
    for (i in 1..10) {
        val square = i * i
        val cube = i * i * i
        val factorial = factorial(i)
        println("Number: $i")
        println("Square: $square")
        println("Cube: $cube")
        println("Factorial: $factorial")
        println()
    }
}
fun factorial(n: Int): Long {
    var result = 1L
    for (i in 1..n) {
        result *= i
    }
    return result
}

//output:=
//Number: 1
//Square: 1
//Cube: 1
//Factorial: 1
//
//Number: 2
//Square: 4
//Cube: 8
//Factorial: 2
//
//Number: 3
//Square: 9
//Cube: 27
//Factorial: 6
//
//Number: 4
//Square: 16
//Cube: 64
//Factorial: 24
//
//Number: 5
//Square: 25
//Cube: 125
//Factorial: 120
//
//Number: 6
//Square: 36
//Cube: 216
//Factorial: 720
//
//Number: 7
//Square: 49
//Cube: 343
//Factorial: 5040
//
//Number: 8
//Square: 64
//Cube: 512
//Factorial: 40320
//
//Number: 9
//Square: 81
//Cube: 729
//Factorial: 362880
//
//Number: 10
//Square: 100
//Cube: 1000
//Factorial: 3628800

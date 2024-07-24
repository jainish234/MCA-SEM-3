//19.Write a program to read the value of X and Y and print the
//result of following expression (2X+3Y)/XY.

fun main() {
    println("Enter the value of X:")
    val x = readLine()!!.toDouble()
    println("Enter the value of Y:")
    val y = readLine()!!.toDouble()
    val result = (2 * x + 3 * y) / (x * y)
    println("Result = $result")
}

//output:=
//Enter the value of X:
//55
//Enter the value of Y:
//11
//Result = 0.23636363636363636

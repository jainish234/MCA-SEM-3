//17. Write a program to read the value of X and Y and print the
//result of following expression (X+Y)*(X-Y).

fun main() {
    println("Enter the value of X:")
    val x = readLine()?.toInt() ?: 0
    println("Enter the value of Y:")
    val y = readLine()?.toInt() ?: 0
    val result = (x + y) * (x - y)
    println("($x + $y) * ($x - $y) = $result")
}

//output:=
//Enter the value of X:
//81
//Enter the value of Y:
//23
//(81 + 23) * (81 - 23) = 6032
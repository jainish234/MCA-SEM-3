//16. Write a program to read the value of X and Y and
//print the result of following expression (X+Y)/2

fun main() {
    println("Enter the value of X:")
    val x = readLine()?.toInt() ?: 0
    println("Enter the value of Y:")
    val y = readLine()?.toInt() ?: 0
    val result = (x + y) / 2
    println("(X + Y) / 2 = $result")
}

//output:=
//Enter the value of X:
//78
//Enter the value of Y:
//24
//(X + Y) / 2 = 51


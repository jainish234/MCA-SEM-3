//37. Write a program to find out minimum from three number.

fun main() {
    val num1 = 30
    val num2 = 19
    val num3 = 55
    val min = if (num1 <= num2 && num1 <= num3) {
        num1
    }
    else if (num2 <= num1 && num2 <= num3) {
        num2
    }
    else {
        num3
    }
    println("Minimum number is: $min")
}

//output:=
//Minimum number is: 19

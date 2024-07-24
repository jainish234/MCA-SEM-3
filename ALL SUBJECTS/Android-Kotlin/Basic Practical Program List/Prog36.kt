//36. Write a program to find out maximum from three number.
fun main() {
    val num1 = 11
    val num2 = 46
    val num3 = 20
    val max = if (num1 >= num2 && num1 >= num3) {
        num1
    }
    else if (num2 >= num1 && num2 >= num3) {
        num2
    }
    else {
        num3
    }
    println("Maximum number is: $max")
}

//output:=
//Maximum number is: 46
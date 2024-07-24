//20. Write a program to convert negative to positive and positive to
//negative.
fun main() {
    println("Enter a number:")
    val number = readLine()!!.toInt()
    val result = if (number >= 0) {
        -number
    } else {
        kotlin.math.abs(number)
    }
    println("Converted result: $result")
}

//output:=
//Enter a number:
//22
//Converted result: -22

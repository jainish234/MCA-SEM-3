//27.Write a program that accepts the year from user and check it leap year or not.

fun main() {
    println("Enter a year:")
    val year = readLine()!!.toInt()
    val isLeapYear = if (year % 4 == 0) {
        if (year % 100 == 0) {
            year % 400 == 0
        } else {
            true
        }
    } else {
        false
    }
    if (isLeapYear) {
        println("$year is a leap year.")
    } else {
        println("$year is not a leap year")
    }
}

//output:=
//Enter a year:
//2022
//2022 is not a leap year
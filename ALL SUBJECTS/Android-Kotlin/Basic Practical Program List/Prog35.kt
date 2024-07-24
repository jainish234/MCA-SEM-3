//35. Write a program input one integer number display appropriate name of month.

fun main() {
    println("Enter the month number (1-12): ")
    val monthNumber = readLine()?.toIntOrNull()
    if (monthNumber != null && monthNumber in 1..12) {
        val monthName = when (monthNumber) {
            1 -> "January"
            2 -> "February"
            3 -> "March"
            4 -> "April"
            5 -> "May"
            6 -> "June"
            7 -> "July"
            8 -> "August"
            9 -> "September"
            10 -> "October"
            11 -> "November"
            12 -> "December"
            else -> "Invalid month number"
        }
        println("Month name: $monthName")
    } else {
        println("Invalid input. Please enter a valid month number")
    }
}

//output:=
//Enter the month number (1-12):
//2
//Month name: February
//34. Write a program input one integer number display appropriate day of week.

fun main() {
    println("Enter an (1-7) to display the day of the week:")
    val dayNumber = readLine()?.toIntOrNull()
    val day = when (dayNumber) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Invalid day number entered"
    }
    println("Day of the week: $day")
}

//output:=
//Enter an (1-7) to display the day of the week:
//1
//Day of the week: Sunday
//38. Enter age of person and display message as
//Up to 5 year Kid
//5- 12 Children
//13 – 19 Teenager
//20 – 30 Young
//31 – 60 Mid age group
//60 or above Old
fun main() {
    println("Enter the age of the person:")
    val age = readLine()?.toIntOrNull()
    if (age != null) {
        val message = when {
                    age <= 5 -> "Kid"
            age in 6..12 -> "Children"
            age in 13..19 -> "Teenager"
            age in 20..30 -> "Young"
            age in 31..60 -> "Mid age group"
            else -> "Old"
        }
        println("Age $age belongs to: $message")
    } else {
        println("Invalid input. Please enter a valid age.")
    }
}

//output:=
//Enter the age of the person:
//25
//Age 25 belongs to: Young

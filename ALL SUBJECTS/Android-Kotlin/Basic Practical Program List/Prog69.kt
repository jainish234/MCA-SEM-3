//69. Accept number and find how many zeros are there.
fun main() {
    println("Enter a number: ")
    val number = readLine()?.toIntOrNull()
    if (number != null) {
        val countZeros = number.toString().count { it == '0' }
        println("Number of zeros in $number: $countZeros")
    } else {
        println("Invalid input. Please enter a valid number.")
    }
}

//output:=
//Enter a number:
//65
//Number of zeros in 65: 0
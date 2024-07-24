//46. Get a string from user and check it is vowel or consonants.

fun main() {
    val input = readLine()?.trim()?.toLowerCase()
    if (input != null && input.length == 1) {
        if (input in "aeiou") {
            println("$input is a vowel.")
        } else if (input in "abcdefghijklmnopqrstuvwxyz") {
            println("$input is a consonant.")
        } else {
            println("Invalid input. Please enter a single alphabet character.")
        }
    } else {
        println("Invalid input. Please enter a single alphabet character.")
    }
}

//output:=
//e
//e is a vowel.

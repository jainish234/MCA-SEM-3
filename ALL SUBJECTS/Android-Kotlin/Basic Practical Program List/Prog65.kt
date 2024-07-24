//65. Display reverse number.

fun main() {
    val number = 12345
    var reversed = 0
    var original = number
    while (original != 0) {
        val digit = original % 10
        reversed = reversed * 10 + digit
        original /= 10
    }
    println("Original number: $number")
    println("Reversed number: $reversed")
}

//output:=
//Original number: 12345
//Reversed number: 54321
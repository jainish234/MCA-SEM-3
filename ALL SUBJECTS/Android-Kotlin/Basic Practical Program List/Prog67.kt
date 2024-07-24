//67. Check entered number is palindrome or not.

fun main() {
    println("Enter a number:")
    val input = readLine() ?: return
    val number = input.toIntOrNull() ?: return
    if (isPalindrome(number)) {
        println("$number is a palindrome.")
    } else {
        println("$number is not a palindrome.")
    }
}
fun isPalindrome(number: Int): Boolean {
    val original = number.toString()
    val reversed = original.reversed()
    return original == reversed
}

//output:=
//Enter a number:
//70
//70 is not a palindrome.

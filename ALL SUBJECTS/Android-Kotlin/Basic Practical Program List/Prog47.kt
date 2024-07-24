//47. Write a program that accept character from keyboard
//and determine whether the character is a capital letter,
//small letter, digit or a special character

fun main() {
    print("Enter a character: ")
    val ch = readLine()!!.first()
    when {
        ch in 'A'..'Z' -> println("$ch is a capital letter.")
        ch in 'a'..'z' -> println("$ch is a small letter.")
        ch in '0'..'9' -> println("$ch is a digit.")
        else -> println("$ch is a special character.")
    }
}

//output:=
//Enter a character: a
//a is a small letter.
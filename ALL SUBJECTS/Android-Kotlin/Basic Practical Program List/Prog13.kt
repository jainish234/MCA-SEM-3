//13. Write a program to swap two values.

fun main() {
    var a = 40
    var b = 80
    println("Before swapping:")
    println("a = $a")
    println("b = $b")
    val temp = a
    a = b
    b = temp
    println("After swapping:")
    println("a = $a")
    println("b = $b")
}

//output:=
//Before swapping:
//a = 40
//b = 80
//After swapping:
//a = 80
//b = 40


//14.Write a program to swap two values without using third variable.
fun main() {
    var a = 70
    var b = 30
    println("Before swapping:")
    println("a = $a")
    println("b = $b")
    a = a + b
    b = a - b
    a = a - b
    println("\nAfter swapping:")
    println("a = $a")
    println("b = $b")
}

//output:=
//Before swapping:
//a = 70
//b = 30
//
//After swapping:
//a = 30
//b = 70
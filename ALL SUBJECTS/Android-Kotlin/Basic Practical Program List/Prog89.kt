//89.
//A
//B C
//D E F
//G H I J
//K L M N O

fun main() {
    val rows = 5
    var currentChar = 'A'

    for (i in 1..rows) {
        for (j in 1..i) {
            print("$currentChar ")
            currentChar++
        }
        println()
    }
}

//output:=
//A
//B C
//D E F
//G H I J
//K L M N O
//78.
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5

fun main() {
    for (i in 1..5) {
        for (j in 1..i) {
            print("$j ")
        }
        println()
    }
}

//output:=

//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5

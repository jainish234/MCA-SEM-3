//79.
//5
//5 4
//5 4 3
//5 4 3 2
//5 4 3 2 1

fun main() {
    for (i in 5 downTo 1) {
        for (j in 5 downTo i) {
            print("$j ")
        }
        println()
    }
}

//output:

//5
//5 4
//5 4 3
//5 4 3 2
//5 4 3 2 1
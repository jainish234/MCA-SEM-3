//74.
//1 2 3 4 5
//$ 2 3 4 5
//$ $ 3 4 5
//$ $ $ 4 5
//$ $ $ $ 5

fun main() {
    for (i in 0 until 5) {
        for (j in 0 until 5) {
            if (j < i) {
                print("$ ")
            } else {
                print("${j + 1} ")
            }
        }
        println()
    }
}

//output:=

//1 2 3 4 5
//$ 2 3 4 5
//$ $ 3 4 5
//$ $ $ 4 5
//$ $ $ $ 5

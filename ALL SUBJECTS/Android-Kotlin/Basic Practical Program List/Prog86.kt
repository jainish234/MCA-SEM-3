//86.
//A A A A A
//B B B B B
//C C C C C
//D D D D D
//E E E E E

fun main() {
    val rows = 5
    val cols = 5

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            print("${'A' + i} ")
        }
        println()
    }
}

//output:=

//A A A A A
//B B B B B
//C C C C C
//D D D D D
//E E E E E
//87.
//* * * * *
//*       *
//*       *
//*       *
//* * * * *

fun main() {
    val rows = 5
    val cols = 5

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                print("* ")
            } else {
                print("  ")
            }
        }
        println()
    }
}

//output:=
//
//* * * * *
//*       *
//*       *
//*       *
//* * * * *
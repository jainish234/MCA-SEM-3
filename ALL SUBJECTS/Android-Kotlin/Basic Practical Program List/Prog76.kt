//76.
//X 0 0 0 0
//X X 0 0 0
//X X X 0 0
//X X X X 0
//X X X X X

fun main() {
    for (i in 0 until 5) {
        for (j in 0 until 5) {
            if (j <= i) {
                print("X ")
            } else {
                print("0 ")
            }
        }
        println()
    }
}

//output:=
//
//X 0 0 0 0
//X X 0 0 0
//X X X 0 0
//X X X X 0
//X X X X X

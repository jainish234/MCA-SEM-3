//81.
//1
//0 1
//0 1 0
//1 0 1 0
//1 0 1 0 1
fun main() {
    for (i in 0 until 5) {
        for (j in 0 until 5 - i - 1) {
            print(" ")
        }
        for (j in 0..i) {
            print("${if (j % 2 == 0) 1 else 0} ")
        }
        println()
    }
}

//output:=
//1
//1 0
//1 0 1
//1 0 1 0
//1 0 1 0 1
//58. Print series 1 + 4 – 9 + 16 – 25 + 36 + _ _ _ + N2.

fun main() {
    val N = 7
    var sign = 1
    var num = 1
    for (i in 1..N) {
        val term = sign * num * num
        print("$term ")
        sign *= -1
        num++
    }
}

//output:=
//1 -4 9 -16 25 -36 49
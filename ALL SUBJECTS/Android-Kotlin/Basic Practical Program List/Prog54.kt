//54. Print 1 2 3 5 6 7 9 -_ _ _ n

fun main() {
    val n = 10
    var count = 0
    var num = 1
    while (count < n) {
        if (num != 4 && num != 8) {
            print("$num ")
            count++
        }
        num++
    }
}

//output:=
//1 2 3 5 6 7 9 10 11 12
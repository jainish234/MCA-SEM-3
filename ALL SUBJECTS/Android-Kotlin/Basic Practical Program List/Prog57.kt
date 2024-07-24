//57. Print series of 1/2, 2/3, 3/4, 4/5, _ _ _ N/N+1.

fun main() {
    val N = 10
    for (i in 1..N) {
        println("$i/${i + 1}")
    }
}

//output:=
//1/2
//2/3
//3/4
//4/5
//5/6
//6/7
//7/8
//8/9
//9/10
//10/11

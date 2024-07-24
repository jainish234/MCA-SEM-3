//51. Print 1 2 4 8 16 32 64 128 256 512 1024.

fun main() {
    var number = 1
    repeat(11) {
        print("$number ")
        number *= 2
    }
}

//output:=
//1 2 4 8 16 32 64 128 256 512 1024
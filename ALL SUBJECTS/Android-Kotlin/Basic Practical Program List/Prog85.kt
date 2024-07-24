//85.
//    *
//   * *
//  * * *
// * * * *
//* * * * *

fun main() {
    for (i in 0 .. 4){
        for (j in 0 .. 4-i){
            print(" ")
        }
        for (k in 0 .. i){
            print("* ")
        }
        println(" ")
    }
}

//output:=

//    *
//   * *
//  * * *
// * * * *
//* * * * *
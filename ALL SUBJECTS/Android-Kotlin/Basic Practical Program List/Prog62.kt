//62. Print prime number between given range.

fun main() {
    val start = 1
    val end = 100
    println("Prime numbers between $start and $end are:")
    for (num in start..end) {
        if (isPrime(num)) {
            println(num)
        }
    }
}
fun isPrime(num: Int): Boolean {
    if (num <= 1) {
        return false
    }
    for (i in 2 until num) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}

//output:=
//Prime numbers between 1 and 100 are:
//2
//3
//5
//7
//11
//13
//17
//19
//23
//29
//31
//37
//41
//43
//47
//53
//59
//61
//67
//71
//73
//79
//83
//89
//97

//68. Count odd and even digits from given number.
fun main() {
    val number = 1234567
    var evenCount = 0
    var oddCount = 0
    var num = number
    while (num != 0) {
        val digit = num % 10
        if (digit % 2 == 0) {
            evenCount++
        } else {
            oddCount++
        }
        num /= 10
    }
    println("Number of even digits: $evenCount")
    println("Number of odd digits: $oddCount")
}

//output:=
//Number of even digits: 3
//Number of odd digits: 4

//21. Write a program that accept 5 numbers from user and find average
//of the value.
fun main() {
    var sum = 0.0
    println("Enter 5 numbers:")
    for (i in 1..5) {
        print("Enter number $i: ")
        val number = readLine()!!.toDouble()
        sum += number
    }
    val average = sum / 5
    println("Average = $average")
}

//output:=
//Enter 5 numbers:
//Enter number 1: 2
//Enter number 2: 3
//Enter number 3: 4
//Enter number 4: 5
//Enter number 5: 6
//Average = 4.0

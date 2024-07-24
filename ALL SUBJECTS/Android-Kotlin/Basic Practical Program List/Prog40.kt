//40. Write a program input 5 subject marks and find class and result.

fun main() {
    val subjects = 5
    val marks = IntArray(subjects)
    for (i in 0 until subjects) {
        print("Enter marks for Subject ${i + 1}: ")
        marks[i] = readLine()!!.toInt()
    }
    val total = marks.sum()
    val average = total / subjects.toDouble()
    val result = when {
        average >= 80 -> "Distinction"
        average >= 60 -> "First Class"
        average >= 50 -> "Second Class"
        average >= 40 -> "Pass Class"
        else -> "Fail"
    }
    println("\nTotal Marks: $total")
    println("Average Marks: %.2f".format(average))
    println("Result: $result")
}

//output:=
//Enter marks for Subject 1: 80
//Enter marks for Subject 2: 70
//Enter marks for Subject 3: 60
//Enter marks for Subject 4: 50
//Enter marks for Subject 5: 40
//
//Total Marks: 300
//Average Marks: 60.00
//Result: First Class


//6. Write a program to calculate 10% bonus of salary.
fun main() {
    val salary = 50000.0

    val bonus = calculateBonus(salary)

    println("The 10% bonus for a salary of $$salary is $$bonus")
}

fun calculateBonus(salary: Double): Double {
    return salary * 0.10
}

//output:=
//The 10% bonus for a salary of $50000.0 is $5000.0
//22. Write a program to find out the net salary of an employee and
//get the basic salary from him. Applicable TA 4%, DA 30%, HRA 15%
//on basic salary. Applicable 3% tax 12% PF on basic salary.

fun main() {
    println("Enter the Basic Salary:")
    val basicSalary = readLine()!!.toDouble()
    val ta = 0.04
    val da = 0.30
    val hra = 0.15
    val tax = 0.03
    val pf = 0.12
    val Ta = basicSalary * ta
    val Da = basicSalary * da
    val Hra = basicSalary * hra
    val totalAllowances = ta + da + hra
    val Tax = basicSalary * tax
    val Pf = basicSalary * pf
    val totalDeductions = tax + pf
    val netSalary = basicSalary + totalAllowances - totalDeductions
    println("Net Salary: $netSalary")
}

//output:=
//Enter the Basic Salary:
//80000
//Net Salary: 80000.34000000001
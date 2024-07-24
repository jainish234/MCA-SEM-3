//5. Write a program to calculate compound interest.

fun main() {
    val principalAmount = 10000
    println("Principal amount is defined as: $principalAmount")

    val interestRate = 5
    println("The rate of interest is defined as: $interestRate %")

    val timePeriod = 3
    println("The time period is defined as: $timePeriod years")

    val compoundInterest = principalAmount.toDouble() * Math.pow((1 + interestRate.toDouble()/100.00),timePeriod.toDouble())- principalAmount
    println(" Compound Interest is: $compoundInterest")
}

//output:=
//Principal amount is defined as: 10000
//The rate of interest is defined as: 5 %
//The time period is defined as: 3 years
//Compound Interest is: 1576.2500000000018

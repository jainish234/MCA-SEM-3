//4. Write a program to calculate simple interest.

fun main() {
    val principal = 10000.0
    val rate = 5.5
    val time = 2.0

    val simpleInterest = (principal * rate * time) / 100

    println("Principal amount: \$${principal}")
    println("Rate of interest: ${rate}% per annum")
    println("Time period: ${time} years")
    println("Simple Interest: \$${simpleInterest}")
}

//output:=
//Principal amount: $10000.0
//Rate of interest: 5.5% per annum
//Time period: 2.0 years
//Simple Interest: $1100.0

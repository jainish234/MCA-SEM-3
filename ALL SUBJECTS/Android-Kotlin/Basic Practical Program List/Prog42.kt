//42. Write a program that reads a sales bill amount calculate
//discount on bill amount as follows if bill amount less than 5000
//calculate 7.5% discount on bill amount otherwise calculate11%
//discount on bill. Print bill amount discount amount and net
//payable bill.

fun main() {
    println("Enter the bill amount:")
    val billAmount = readLine()?.toDoubleOrNull()
    if (billAmount != null) {
        val discount = if (billAmount < 5000) {
            billAmount * 0.075
        } else {
            billAmount * 0.11
        }
        val netPayable = billAmount - discount
        println("Bill Amount: \u20B9$billAmount")
        println("Discount Amount: \u20B9$discount")
        println("Net Payable Bill: \u20B9$netPayable")
    } else {
        println("Invalid input. Please enter a valid numeric bill amount.")
    }
}

//output:=
//Enter the bill amount:
//9000
//Bill Amount: ₹9000.0
//Discount Amount: ₹990.0
//Net Payable Bill: ₹8010.0
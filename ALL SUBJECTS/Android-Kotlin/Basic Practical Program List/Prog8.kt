//8. The distance between two cities is input through keyboard. Write a program to convertand print
//this distance in feet, meter, inch and centimeter

fun main() {
    println("Enter the distance two cities in kilometers: ")
    val distance = readLine()?.toDoubleOrNull()
    if (distance != null) {
        val feetConversion = distance * 3280.84
        val meterConversion = distance * 1000
        val inchConversion = distance * 39370.1
        val centimeterConversion = distance * 100000
        println("feet: $feetConversion feet")
        println("meters: $meterConversion meters")
        println("inches: $inchConversion inches")
        println("centimeters: $centimeterConversion centimeters")
    } else {
        println("Invalid input.")
    }
}

//output:=
//Enter the distance two cities in kilometers:
//600
//feet: 1968504.0 feet
//meters: 600000.0 meters
//inches: 2.362206E7 inches
//centimeters: 6.0E7 centimeters
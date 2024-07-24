//7. Write a program to convert KM into Meter

fun main(){
    val kilometers = 5.0

    val meters = convertKmToMeters(kilometers)

    println("$kilometers kilometers is equal to $meters meters")
}
fun convertKmToMeters(kilometers: Double):Double{
    return kilometers * 1000
}

//output:=
//5.0 kilometers is equal to 5000.0 meters
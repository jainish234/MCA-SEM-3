//41. Write a program to find number which number is divisible by 3 but
//not divisible by 7.
fun main() {
    val start = 1
    val end = 100
    println("Numbers divisible by 3 but not divisible by 7:")
    for (num in start..end) {
        if (num % 3 == 0 && num % 7 != 0) {
            println(num)
        }
    }
}

//Numbers divisible by 3 but not divisible by 7:
//3
//6
//9
//12
//15
//18
//24
//27
//30
//33
//36
//39
//45
//48
//51
//54
//57
//60
//66
//69
//72
//75
//78
//81
//87
//90
//93
//96
//99

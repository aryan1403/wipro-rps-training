import java.util.Scanner
import kotlin.math.max

fun main() {
//    print("Enter your name: ")
//    var name = readLine()
//    println("Your name is $name")

    var sc = Scanner(System.`in`)
//    var num = sc.nextInt()
//
//    for (i in 1..10) {
//        println("$num * $i = ${num.times(i)}")
//    }

//    for (ch in 'a'..'x') {
//        print("$ch, ")
//    }

//    print("Enter the day number: ")
//    val day = sc.nextInt();
//    val result = when (day) {
//        1 -> "Monday"
//        2 -> "Tuesday"
//        3 -> "Wednesday"
//        4 -> "Thursday"
//        5 -> "Friday"
//        6 -> "Saturday"
//        7 -> "Sunday"
//        else -> "Invalid day"
//    }
//    println(result)
    AarraysExample()

    print(sum(3, 6))

}

fun sum(a: Int, b: Int): Int {
    val sum = a.dec() + b.inc();
    return sum;
}

fun AarraysExample() {
    val cars = arrayOf("Porsche", "Ferrari", "Koenisseg", "GT3RS")
    //print(cars[cars.size - 1])
    for (car in cars) {
        println(car)
    }
}

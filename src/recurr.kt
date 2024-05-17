fun factorial(num: Int): Long {
    return if(num == 1) num.toLong()
    else num * factorial(num -1)
}

fun main() {
    println(factorial(5))
}
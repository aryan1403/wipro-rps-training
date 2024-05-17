var lambda = {a: Int, b: Int -> a + b }

fun higherfunc(e: (Int, Int) -> Int) {
    var result = e(2, 4)
    println("Result: $result")
}

fun main() {
    higherfunc(lambda)
}
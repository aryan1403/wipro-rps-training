var lambda = {a: Int, b: Int -> a + b }

fun higherfunc(e: (Int, Int) -> Int) {
    var result = e(2, 4)
    println("Result: $result")
}

var notify = { msg: String -> "Notification dispatched: $msg" }

fun notifyUpdate(e: (String) -> String) {
    var response = e("Hello Aaryan");

    println(response)
}

fun main() {
    notifyUpdate(notify)
}
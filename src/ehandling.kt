class ehandling {
    fun division(a: Int, b: Int): Any {
        return try {
            a / b
        } catch (e: Exception) {
            "Division by 0 not allowed"
        } finally {
            println("Division is done")
        }
    }
}

fun main() {
    val obj = ehandling()
    val res = obj.division(10, 0)
    println("The division: $res")
}
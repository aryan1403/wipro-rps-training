import java.util.Scanner

class nsaf {
    fun ok() {
        var s: String? = readLine()

        if(s != null) {
            println()
        } else {
            println("Value is null")
        }

        print(s)
    }
}

fun main() {
    var obj = nsaf()
    obj.ok()
}
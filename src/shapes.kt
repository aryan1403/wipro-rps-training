class shapes {
    fun area(): Double {
        return 0.0
    }
}

fun main() {
    fun shapes.perimeter(): Double {
        return 0.0
    }

    var s = shapes()
    s.area()
    s.perimeter()
}
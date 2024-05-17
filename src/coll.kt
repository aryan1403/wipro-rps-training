val fruits = listOf("Apple", "Banana", "Orange", "Grapes", "", "", "Blueberry", "")

fun ok() {
    println("First fruit: ${fruits[0]}")
    println("Last Element: ${fruits.last()}")

    for (fruit in fruits) {
        println(fruit)
    }

    val res = fruits.filter { it.isNotEmpty() }
    print(res)
}

fun setok() {
    var set = setOf("Aaryan", "Arush", "Arush", "Ananya", "Rahul")

    set.forEach(::println)
}

// to -> :
fun mapok() {
    val map = mapOf(1 to "Aaryan", 2 to "Arush", 3 to "Ananya")

    map.entries.forEach(::println)
}

fun main() {
    mapok()
}
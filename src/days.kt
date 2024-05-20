enum class days(var color: String) {
    Sunday("yellow"),
    Monday(""),
    Tuesday(""),
    Wednesday(""),
    Thursday(""),
    Friday(""),
    Saturday("")
}

fun main() {
    val color = days.Sunday.color;
}
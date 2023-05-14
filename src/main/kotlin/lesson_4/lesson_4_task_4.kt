package lesson_4

fun main() {
    val numberDay = 5
    val d = numberDay % 2 == 0
    val arms = !d
    val legs = d
    val back = d
    val abs = !d

    val info = """
        Упражнение для рук $arms
        Упражнения для ног $legs
        Упражнения для спины $back
        Упражнения для пресса $abs
    """.trimIndent()

    println(info)
}

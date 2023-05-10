package lesson_7

fun main() {
    println("Введите число")
    val number = readLine()!!.toInt()

    for (i in 0..number) {
        val even = i % 2
        if (even == 0) {
            println(i)
        }

    }
}
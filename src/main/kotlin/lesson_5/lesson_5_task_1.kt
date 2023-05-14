package lesson_5

fun main() {
    println("Сложите два числа:")
    println(NUMBER_1)
    println(NUMbER_2)

    val numberResult = readLine()!!.toInt()

    if (numberResult == NUMBER_1 + NUMbER_2) {
        println("Добро пожаловать!")
    } else {
        println("Доступ закрыт!")
    }
}

const val NUMBER_1 = 7
const val NUMbER_2 = 4
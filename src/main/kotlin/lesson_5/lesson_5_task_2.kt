package lesson_5

fun main() {
    println("Введите год рождения!")
    val yearOfBirth = readLine()!!.toInt()
    val yearCurrent = 2023
    val userAge = yearCurrent - yearOfBirth

    if (userAge >= AGE_OF_MAJORITY) {
        println("Показть экран со скрытым контентом")
    } else {
        println("Доступ запрещен!")
    }


}
const val AGE_OF_MAJORITY = 18
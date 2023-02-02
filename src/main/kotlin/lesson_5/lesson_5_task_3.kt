package lesson_5

fun main() {
    println("Введите два числа от 1 до 100!")
    val numberOne = readLine()!!.toInt()
    val numberTwo = readLine()!!.toInt()

    val resultText = if ((numberOne == NUMBER_1 && numberTwo == NUMBER_2) || (numberOne == NUMBER_2 && numberTwo == NUMBER_1))
        "Поздпавляем! Вы выиграли главный приз!"
    else if ((numberOne == NUMBER_1 || numberOne == NUMBER_2) || (numberTwo == NUMBER_1 || numberTwo == NUMBER_2))
        "Вы выиграли утешительный приз"
    else "Неудача! Крутите барабан!"

    println(resultText)
}

const val NUMBER_1 = 42
const val NUMBER_2 = 24
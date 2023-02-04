package lesson_5

import kotlin.random.Random


fun main() {

    val numberOne = (0..100).random()
    //println(numberOne)
    // для проверки работы программы

    val numberEnd = (0..100).random()
    //println(numberEnd)
    // для проверки работы программы

    println("Введите два числа от 1 до 100")

    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()

    if ((number1 == numberOne && number2 == numberEnd) || (number1 == numberEnd && number2 == numberOne)) {
        println("Ура! Вы выиграли!")
    } else if ((number1 == numberOne || number1 == numberEnd) || (number2 == numberEnd || number2 == numberOne)) {
        println("Вы угадали 1 число")
    } else {
        println("Вы проиграли Выигрышные числа: $numberOne $numberEnd")
    }
}
package lesson_5

import kotlin.random.Random

fun main() {
    val numberOne = (0..100).random()
    println(numberOne)
    val numberEnd = (0..100).random()
    println(numberEnd)
    println("Введите два числа от 1 до 100")

    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()

    if ((number1 == numberOne && number2 == numberEnd) || (number1 == numberEnd && number2 == numberOne)) {
        println("Ура! Вы выиграли!")
    } else if ((number1 == numberOne) || (number2 != numberEnd)) {
        println("Вы угадали 1 число и получаете утешительный приз! Выигрышные числа: $numberOne $numberEnd")
    } else if ((number1 != numberOne) || (number2 == numberOne)) {
        println("Вы угадали 1 число и получаете утешительный приз! Выигрышные числа: $numberOne $numberEnd")
    } else if ((number1 == numberEnd) || (number2 != numberEnd)) {
        println("Вы угадали 1 число и получаете утешительный приз! Выигрышные числа: $numberOne $numberEnd")
    } else if (numberOne == number1 || numberOne == number2) {
        if (numberEnd == number1 || numberEnd == number2) {

        } else {
            println("Вы проиграли. Выигрышные числа: $numberOne $numberEnd")
        }
    }
}
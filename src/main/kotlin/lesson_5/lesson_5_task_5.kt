package lesson_5

fun main() {
    val numberFirst = (0..100).random()
    val numberSecond = (0..100).random()

    println("Введите два числа от 1 до 100")

    val number1 = readln().toInt()
    val number2 = readln().toInt()

    if ((number1 == numberFirst && number2 == numberSecond) || (number1 == numberSecond && number2 == numberFirst)) {
        println("Ура! Вы выиграли!")
    } else if ((number1 == numberFirst) && (number2 != numberSecond)) {
        println("Вы угадали 1 число и получаете утешительный приз! Второе число: $numberSecond")
    } else if ((number2 == numberSecond) && (number1 != numberFirst)) {
        println("Вы угадали 1 число и получаете утешительный приз! Второе число: $numberFirst")
    } else {
            println("Вы проиграли. Выигрышные числа: $numberFirst $numberSecond")
        }
    }

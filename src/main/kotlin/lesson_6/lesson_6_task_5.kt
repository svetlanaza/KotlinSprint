package lesson_6

fun main() {
    println("Здравствуйте! Сложите два числа")
    var counter = 3
    do {

        var number1 = (1..9).random()
        println(number1)
        var number2 = (1..9).random()
        println(number2)

        val result = readLine()!!.toInt()

        if (result == number1 + number2) {
            println("Добро пожаловать!")
        } else {
            println("Неправильно, осталось ${--counter} попытки/попыток!\nСложите два числа")
        }

        if (result == number1 + number2) {
            return
            println("Добро пожаловать!")
        }
    } while (counter > 0)

    println("Доступ закрыт")
}
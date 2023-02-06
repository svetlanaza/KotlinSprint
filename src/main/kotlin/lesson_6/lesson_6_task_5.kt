package lesson_6

fun main() {
    println("Здравствуйте!")

    var counter = 3
    do {

        var number1 = (1..9).random()
        var number2 = (1..9).random()

        println("Сложите $number1 и $number2")

        val result = readLine()!!.toInt()

        if (result == number1 + number2) {
            println("Добро пожаловать!")
        } else {
            println("Неправильно, осталось ${--counter} попытки/попыток!")
        }

        if (result == number1 + number2) {
            return
        }
    } while (counter > 0)

    println("Доступ закрыт")
}
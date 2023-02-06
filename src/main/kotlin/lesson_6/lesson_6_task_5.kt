package lesson_6

fun main() {
    println("Здравствуйте!")

    var counter = 3
    do {

        val number1 = (1..9).random()
        val number2 = (1..9).random()

        println("Сложите $number1 и $number2")

        val result = readLine()!!.toInt()

        if (result == number1 + number2) {
            println("Добро пожаловать!")
            return
        } else {
            println("Неправильно, осталось ${--counter} попытки/попыток!")
        }

    } while (counter > 0)

    println("Доступ закрыт")
}
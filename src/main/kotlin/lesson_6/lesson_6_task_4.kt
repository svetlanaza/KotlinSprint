package lesson_6

fun main() {
    val numbers = (1..9).random()
    println(numbers)

    println("Введите число от 1 до 9")

    val number = readLine()!!.toInt()

    var counter = 4


    if (number == numbers) {
        println("Это была великолепная игра!")
    } else {
        do {
            println("Неправильно, осталось ${counter--} попытки. Введите число")
            val numberTwo = readLine()!!.toInt()
            if (numberTwo == numbers) {
                println("Поздравляем вы выигали!")
                return

            }
        } while (counter > 0)
        println("Сегодня не ваш день! Приходите завтра!")


    }

}





package lesson_7

import java.time.Year

fun main() {
    for (i in 9999 downTo 1000) {
        val codeSms = (1000..9999).random()

        println("Ваш код авторизации № $codeSms")
        println("Введите код из SMS")

        val code = readLine()!!.toInt()
        if (code == codeSms) {
            println("Добро пожаловать")
            return
        } else {
            println("Неверно!")
        }
    }
}
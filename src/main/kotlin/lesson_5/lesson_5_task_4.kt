package lesson_5

fun main() {
    println("Введите логин")

    val login = readLine()

    val resultText = if (login != LOGIN) "Пожалуйств, зарегистрируйтесь!"
    else "Введите пороль"

    println(resultText)

    val password = readLine()

    val resultMessage = if (password == PASSWORD) "Приветствуем Вас, Batman!"
    else "Ошибка авторизации"

    println(resultMessage)
}

const val LOGIN = "Batman"
const val PASSWORD = "password"
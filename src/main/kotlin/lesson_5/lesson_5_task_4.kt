package lesson_5

fun main() {
    println("Введите логин")

    val login = readLine()

    val greetingsMessage = if (login != LOGIN) "Пожалуйста, зарегистрируйтесь!"
    else "Введите пароль"

    println(greetingsMessage)

    val password = readLine()

    val informMessage = if (password == PASSWORD) "Приветствуем Вас, $LOGIN!"
    else "Ошибка авторизации"

    println(informMessage)
}

const val LOGIN = "Batman"
const val PASSWORD = "password"
package lesson_6

fun main() {

    println("Пожалуйста зарегистрируйтесь")
    println("Создайте логин")

    val login = readLine()

    println("Создайте пароль")

    val password = readLine()

    println("Введите логин")

    val confirmationLogin = readLine()


    val trueLogin = if (login == confirmationLogin) {
        println("Ведите пароль")

    } else {

        println("Неправильный логин. Попробуйте еще раз")
    }



    val confirmationPassword = readLine()
    val truePassword = if (password == confirmationPassword) {
        println("Авторизация прошла успешно")
    } else {
        println("Неправильный пароль. Попробуйте еще раз")
    }
}
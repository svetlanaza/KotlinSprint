package lesson_11

class User(
    val id: Int,
    val name: String,
    val login: String,
    var password: String,

    ) {
    fun userData() {
        println("Данные пользователя:")
        println("Id $id")
        println("Имя $name")
        println("Логин $login")
        println("Пароль $password")
    }

    fun userInfo() {
        var bio = userData()
    }

    fun passwordChange() {
        println("Введите текущий пароль")
        val passwordNow = readLine().toString()
        if (passwordNow == password) {
            println("Введите новый пароль")
            val passwordNew = readLine().toString()
            password = passwordNew
            println()
            println("Пароль изменен!")
            println()
        } else {
            println("Неверный пароль")
        }
    }

    fun userMessage(message: String) {
        println("$name, Вам отправленно сообщение на почту - $login, об изменении пароля")
    }
}
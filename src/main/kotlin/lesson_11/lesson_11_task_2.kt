package lesson_11

fun main() {
    val user = Users(
        id = 1,
        name = "Роман",
        login = "roman@mail.com",
        password = "qwerty123",
    )

    user.userData()
    user.passwordChange()
    println()
    user.userMessage("")
    //user.userInfo()
    user.userData()

}

class Users(
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

    fun userInfo(): String? {
        val bio = null
        return readLine().toString()
        println(bio)
    }


    fun passwordChange() {
        println("Введите текущий пароль")
        val passwordNow = readLine().toString()
        if (passwordNow == password) {
            println("Введите новый пароль")
            val passwordNew = readLine().toString()
            password = passwordNew
            println("Пароль изменен!")

        } else {
            println("Неверный пароль")
        }
    }

    fun userMessage(message: String) {
        println("$name, Вам отправленно сообщение на почту - $login, $message")
    }

}
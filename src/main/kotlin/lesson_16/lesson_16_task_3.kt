package lesson_16

class UserHaman(name: String, login: String, private val password: String) {

    fun checkPassword() {
        println("Введите пороль!")
        val passwordEnter = readln()
        if (passwordEnter == password) {
            println("Верный пароль")
        } else {
            println("Неверный пароль")
        }
    }
}

fun main() {
    val user = UserHaman("Alex", "bom@bom", "qwerty48")
    user.checkPassword()
}
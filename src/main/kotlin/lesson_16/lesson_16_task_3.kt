package lesson_16

class UserHaman(name: String, login: String) {
    private val password = "Barmaley13"

    fun checkPassword() {
        if (password == "Barmaley13") {
            println("Добро пожаловать")
        } else {
            println("Неверный пароль")
        }
    }
}

fun main() {
    val user = UserHaman("Alex", "bom@bom")
    user.checkPassword()
}
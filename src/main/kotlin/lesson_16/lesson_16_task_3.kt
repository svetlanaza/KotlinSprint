package lesson_16

class UserHaman(name: String, login: String) {

    private val password = "Barmaley13"
    val name = name

    fun greetingsEndCheckPassword() {
        println("Введите пороль!")
        val passwordEnter = readln()
        if (passwordEnter == password) {
            println("Добро пожаловать, $name!")
        } else {
            println("Неверный пароль")
        }
    }
}

fun main() {
    val user = UserHaman("Alex", "bom@bom")
    user.greetingsEndCheckPassword()
}
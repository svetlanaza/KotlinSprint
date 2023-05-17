package lesson_16

class UserHaman(name: String, login: String, pass: String) {
    val name = name
    val login = login
    private val pass = pass
    fun checkPassword(password: String): Boolean {
        return pass == password
    }
}

fun main() {
    val user = UserHaman("Alex", "bom@bom", "qwerty48")

    println(user.name)
    println(user.login)
    println(user.checkPassword("qwerty48"))
    println(user.checkPassword("qwerty"))

}
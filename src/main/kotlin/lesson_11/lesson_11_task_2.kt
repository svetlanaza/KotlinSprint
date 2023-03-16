package lesson_11

fun main() {
    val user = User(
        id = 1,
        name = "Роман",
        login = "roman@mail.com",
        password = "qwerty123",
    )

    user.userData()
    user.passwordChange()
    user.userInfo()
    println()
    user.userMessage("")
}
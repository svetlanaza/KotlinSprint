package lesson_10


fun main() {
    println("Введите логин:")
    val login = readLine().toString()
    println("Введите пароль:")
    val password = readLine().toString()

    if (checkInput(login) && checkInput(password)) {
        println("Добро пожаловать")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun checkInput(input: String): Boolean {
    return input.length > 3
}

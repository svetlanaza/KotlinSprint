package lesson_10

fun main() {
    println("Придумайте логин: не менее 4 символа")
    reg(4)
    println("Ваш пароль для входа:")
    val userPassword = gener()
    println("Авторизация. Введите логин")
    val userLogin = reg(4)
    println("Введите пароль")
    while (readLine().toString() != userPassword) {
        println("Неправильный пароль")
    }

    println("Вы авторизованы! Введите код из sms")
    val sms = (1000..9999).random().toString()
      println(sms)
    while (readLine().toString() != sms) {
        println("Неправильный код")
    }
    println("Добро пожаловать!")

}
fun reg(int: Int): String {
    val login = readLine().toString()
    if (login.length > 4) {
        println("Несоответствующая длина логина")
    } else {

    }
    return login
}

fun gener(): String {
    var password = ""
    for (i in 0..4) {
        password += ('a'..'z').random().toString()
        password += (0..9).random().toString()
    }
    println(password)
    return password
}

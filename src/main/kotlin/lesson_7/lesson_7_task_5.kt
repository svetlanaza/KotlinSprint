package lesson_7

fun main() {
    println("Сколько символов будет содержать ваш пароль?")
    val numberPassword = readLine()!!.toInt()

    val symbol1 = (0..10).random()
    val symbol2 = ('A'..'Z').random()
    val symbol3 = ('a'..'z').random()

    do {
        println(symbol1)
        println(symbol2)
        println(symbol3)
        val d = numberPassword
        return

    } while (numberPassword > 0)
}

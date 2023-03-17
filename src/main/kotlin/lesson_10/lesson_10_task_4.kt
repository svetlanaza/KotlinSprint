package lesson_10

fun main() {
    var userWin = 0
    var compWin = 0
    var round = 0

    println("Хотите поиграть?")
    while (readLine().toString() == "да") {
        round++
        val result = getRound()
        if (result == "user") userWin++
        else if (result == "comp") compWin++
            println("Еще бросок?")
    }
    println("Вы выиграли $userWin раундов из $round")
}

    fun getRound(): String {
        println("Ход игрока")
        val user = throwBone()

        println("Мой ход")
        val comp = throwBone()

        if (user == comp) {
            println("Ничья")
            return ""
        } else if (user > comp) {
            println("Вы победили")
            return "user"
        } else {
            println("Победил компьютер")
            return "comp"
        }

    }

fun throwBone(): Int {
    val number1 = (1..6).random()
    val number2 = (1..6).random()
    println("На кубиках $number1 и $number2")
    return number1 + number2
}
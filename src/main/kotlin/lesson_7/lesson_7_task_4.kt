package lesson_7

fun main() {
    println("Сколько секунд вы хотите засечь?")
    val number = readLine()!!.toInt()

    for (i in number downTo 0) {

        println("Осталось $i секунд/секунды")
        Thread.sleep(1000)
    }
    println("Время вышло!")
}
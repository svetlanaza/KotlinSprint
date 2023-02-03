package lesson_6

fun main() {
    println("Введите количество секунд")

    val second = readLine()!!.toInt()
    var counter = second

    while (counter > 0) {
        println("Осталось ${counter--} секунд/секунды")
        Thread.sleep(1000)

    }
    println("Прошло $second секунд/секунды")
}
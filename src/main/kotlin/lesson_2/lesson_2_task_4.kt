package lesson_2

fun main() {
    val kristall = 7f
    val ferum = 11f
    val kristallBonus = (kristall / 100 * 20).toInt()
    val ferumBonus = (ferum / 100 * 20).toInt()

    println("Добыто бонусной кристаллической руды - $kristallBonus")
    println("Добыто бонусной железной руды - $ferumBonus")
}
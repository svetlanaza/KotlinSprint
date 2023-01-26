package lesson_2

import kotlin.math.pow

fun main() {
    val deposit = 70000
    val percent = 16.7
    val depositTerm = 20
    val profit = deposit * (1 + percent / 100).pow(depositTerm)

    println(profit)
}
package lesson_13

import java.lang.NumberFormatException

fun main() {
    println("Введите номер")
    val number: Long
    val strNumber = readln().toString()
    try {
        number = strNumber.toLong()
    } catch (ex:NumberFormatException) {
        println("Номер может содержать только цифры")
        return
    }


}
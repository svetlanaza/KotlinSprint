package lesson_4

fun main() {
    var booking = 13

    var freeTables = booking >= 1 && booking < NUMBER_TABLES

    println("Свободые столики на сегодня: $freeTables")

    booking = 9
    freeTables = booking >= 1 && booking < NUMBER_TABLES

    println("Свободные столики на завтра: $freeTables")

}

const val NUMBER_TABLES = 13
package lesson_4

fun main() {
    val weather = "sunny"
    val tent = "open"
    val humidity = 20
    val season = "winter"
    val favorableСonditions = weather == WEATHER && tent == TENT && humidity == HUMIDITY && season != SEASON

    println("Благоприятные условия для бобовых: $favorableСonditions")
}

const val WEATHER = "sunny"
const val TENT = "open"
const val HUMIDITY = 20
const val SEASON = "winter"
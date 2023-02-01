package lesson_4

fun main() {
    val hull = readLine()
    val crew = readLine()!!.toInt()
    val provisions = readLine()!!.toInt()
    val weather = readLine()

    var escapeResult = (hull == HULL_NOT_DAMAGE &&
            crew in 55..CREW_COMPOSITION  &&
            provisions > PROVISION_RESERVE &&
            (weather == WEATHER_CALM || weather != WEATHER_CALM)) ||
            (hull == HULL_LITTLE_DAMAGE &&
                    crew == CREW_COMPOSITION &&
                    provisions > PROVISION_RESERVE &&
                    weather == WEATHER_CALM)

    println("Корабль может покинуть порт $escapeResult")

}

const val HULL_LITTLE_DAMAGE = "Незначительные повреждения"
const val HULL_NOT_DAMAGE = "Без повреждений"
const val CREW_COMPOSITION = 70
const val PROVISION_RESERVE = 50
const val WEATHER_CALM = "Штиль"
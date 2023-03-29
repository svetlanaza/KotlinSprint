package lesson_12

fun main() {
    val date1 = Day("21 апреля", 26, 20, " Ясно", 750)

    date1.printWeather()

    val date2 = Day("22 апреля", 22, 18, "Дождь", 730)

    println()
    date2.printWeather()
}

class Day(
    var date: String,
    var temperDay: Int,
    var temperNight: Int,
    var precipitation: String = "Дождь",
    var pressure: Int
) {
    fun printWeather() {
        println("Прогноз погоды на $date: ")
        println("Температура днем $temperDay градусов")
        println("Температура ночью $temperNight градусов")
        println("Осадки - $precipitation")
        println("Атмосферное давление - $pressure мм")
    }
}
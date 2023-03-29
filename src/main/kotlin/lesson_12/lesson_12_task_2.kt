package lesson_12

fun main() {
    val april20 = WeathersConditionally(20, 16, "Облачно", 750)

    println("Прогноз погоды на 20 апрреля")

    april20.printWeather()

    val april21 = WeathersConditionally(26, 20, "Ясно", 750)

    println()
    println("Прогноз погоды на 21 апреля")

    april21.printWeather()
    val april22 = WeathersConditionally(23, 17, "Дождь", 770)

    println()
    println("Прогноз погоды на 22 апреля")

    april22.printWeather()
}

class WeathersConditionally(_weatherDay: Int, _weatherNight: Int, _precipitation: String, _pressure: Int) {
    var weatherDay = _weatherDay
    var weatherNight = _weatherNight
    var precipitation = _precipitation
    var pressure = _pressure

    fun printWeather() {
        println("Температура днем - $weatherDay градусов")
        println("Температура ночью - $weatherNight градусов")
        println("Осадки - $precipitation")
        println("Атмосферное давление - $pressure мм")
    }

}
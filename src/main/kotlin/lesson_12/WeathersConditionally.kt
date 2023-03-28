package lesson_12

class WeathersConditionally(weatherDay: Int, weatherNight: Int, precipitation: String, atmosPressure: Int) {
    var weather1 = weatherDay
    var weather2 = weatherNight
    var precipitation = precipitation
    var pressure = atmosPressure

    fun printWeather() {
        println("Температура днем - $weather1 градусов")
        println("Температура ночью - $weather2 градусов")
        println("Осадки - $precipitation")
        println("Атмосферное давление - $pressure мм")
    }

}
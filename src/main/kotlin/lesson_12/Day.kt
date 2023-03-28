package lesson_12

class Day ( var date: String, var temperDay: Int, var temperNight: Int, var precipitation: String = "Дождь", var pressure: Int) {
    fun printWeather() {
        println("Прогноз погоды на $date: ")
        println("Температура днем $temperDay градусов")
        println("Температура ночью $temperNight градусов")
        println("Осадки - $precipitation")
        println("Атмосферное давление - $pressure мм")
    }
}
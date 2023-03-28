package lesson_12

class Date  (var dates: String, var temperDay: Int, var temperNight: Int, var pressure: Int, var precipitation: Boolean = true) {
    init {
        println("Прогноз погоды на $dates")
        println("Температура днем - $temperDay градусов")
        println("Температура ночью - $temperNight градусов")
        println("Атмосферное давление - $pressure мм")
        if (precipitation) {
            println("Ожидается дождь")
        } else {
            println("Без осадков")
        }
    }
}
package lesson_12

fun main() {
    var days = mutableListOf<DaysControl>()
    for (i in 0..10) {
        val boolRandom = (0..1).random() == 0
        var day = DaysControl((20..30).random(), (10..20).random(), (650..750).random(), boolRandom)
        days.add(day)
    }
    var averageTemperDay = 0
    var averageTemperNight = 0
    var averagePressure = 0
    var precipitationRain = 0
    for (j in days) {
        averageTemperDay += j.temperDay
        averageTemperNight += j.temperNight
        averagePressure += j.pressure
        if (j.precipitation) precipitationRain++
    }
    averageTemperDay /= days.size
    averageTemperNight /= days.size
    averagePressure /= days.size

    println("Средняя температура днем: $averageTemperDay град")
    println("Средняя температура ночью: $averageTemperNight град")
    println("Среднее атмосферное давление: $averagePressure мм")
    println("Дождливых дней: $precipitationRain ")
}
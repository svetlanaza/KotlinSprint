package lesson_12

fun main() {
    val may18 = Weather()
    may18.temperatureDay = 22
    may18.temperatureDay = 15
    may18.precipitation = "Дождь"
    may18.atmospherePressure = 750

    println("Погода на 18 мая:")
    may18.printWeather()

    val may19 = Weather()
    may19.temperatureDay = 25
    may19.temperatureNight = 18
    may19.precipitation = "Ясно"
    may19.atmospherePressure = 770

    println()
    println("Погода на 19 мая:")
    may19.printWeather()

}
class Weather() {
    var temperatureDay = 20
    var temperatureNight = 12
    var precipitation = "Дождь"
    var atmospherePressure = 750

    fun printWeather() {
        println("Дневная температура: $temperatureDay градусов")
        println("Ночная температура: $temperatureNight градусов")
        println("Осадки: $precipitation")
        println("Атмосферное давление: $atmospherePressure мм")
    }

}
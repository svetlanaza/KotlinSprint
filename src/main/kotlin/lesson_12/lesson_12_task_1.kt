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
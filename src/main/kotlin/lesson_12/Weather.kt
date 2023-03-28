package lesson_12

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
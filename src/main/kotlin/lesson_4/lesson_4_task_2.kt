package lesson_4

fun main() {
    val weight = 42
    val volume = 120
    val averageWeight = weight >= 35 && weight <= 100
    val averageVolume = volume < 100

    println("Груз для категории Average: ${averageWeight && averageVolume}")
}


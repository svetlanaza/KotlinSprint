package lesson_14

open class Ship(
    val name: String,
    val speed: Int,

    ) {
    fun printSpeedMovement() {
        println("\"$name\" движется со скоростью $speed узлов.")
    }
}

class Cargo(
    name: String,
    speed: Int,
) : Ship(name, speed) {
    val capacity = 200
    val spaciousness = 400
    fun printInfoCargo() {
        println("Может перевозить груз массой до $capacity тонн, объемом $spaciousness литров.\n")
    }
}

class Icebreaker(
    name: String,
    speed: Int,
) : Ship(name, speed) {
    val weight = 21000
    val length = 150
    fun breaksIce() {
        println("Может колоть лед.")
    }

    fun infoIcebreaker() {
        println("Имеет водоизмещение $weight тонн и длину $length метров.")
        breaksIce()
    }
}

fun main() {
    val cargo1 = Ship("Адмирал", 20)
    cargo1.printSpeedMovement()
    Cargo("Адмирал", 20).printInfoCargo()
    val icebreaker1 = Ship("Профессор Шварценгольд", 10)
    icebreaker1.printSpeedMovement()
    Icebreaker("Профессор Шварценгольд", 10).infoIcebreaker()

}
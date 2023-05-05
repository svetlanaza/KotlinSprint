package lesson_14

open class Ship(
    val name: String,
    val speed: Int,
    val weight: Int,
    val length: Int,


    ) {
    fun printSpeedMovement() {
        println("\"$name\" движется со скоростью $speed узлов.")
    }
}

class Cargo(
    name: String,
    speed: Int,
    weight: Int,
    length: Int,
) : Ship(name, speed, weight, length) {
    val capacity = 200
    val spaciousness = 400
    fun printInfoCargo() {
        println("Может перевозить груз массой до $capacity тонн, объемом $spaciousness литров.\n")
    }
}

class Icebreaker(
    name: String,
    speed: Int,
    weight: Int,
    length: Int,
) : Ship(name, speed, weight, length) {
    val typeIcebreaker = ""
    val numberOfReactor = 0
    fun breaksIce() {
        println("Может колоть лед.")
    }

    fun infoIcebreaker() {
        println("Имеет водоизмещение $weight тонн и длину $length метров.")
        breaksIce()
    }
}

fun main() {
    val cargo1 = Ship("Адмирал", 20, 400000, 150)
    cargo1.printSpeedMovement()
    Cargo("Адмирал", 20,450000,230).printInfoCargo()
    val icebreaker1 = Ship("Профессор Шварценгольд", 10, 500000, 200)
    icebreaker1.printSpeedMovement()
    Icebreaker("Профессор Шварценгольд", 10,50000,250).infoIcebreaker()

}
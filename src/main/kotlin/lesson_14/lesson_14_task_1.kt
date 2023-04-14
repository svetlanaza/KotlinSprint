package lesson_14

class StandardShip(
    val name: String,
    val speed: Int = 20,
    val capacity: Int = 200,
) {
    fun movement() {
        println("$name движется со скоростью $speed узлов.")
    }

    fun spaciousness() {
        println("$name перевозит $capacity тонн.")
    }
}

fun main() {
    val fastShip = StandardShip("Быстрый")

    fastShip.movement()
    fastShip.spaciousness()
}
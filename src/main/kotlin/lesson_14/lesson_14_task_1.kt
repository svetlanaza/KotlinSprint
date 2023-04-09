package lesson_14

class StandardShip(_name: String) {
    val name = _name
    val speed = 20
    val capacity = 200
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
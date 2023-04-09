package lesson_14

open class Ship(
    val name: String,
    val speed: Int,

) {
    fun movement() {
        println("\"$name\" движется со скоростью $speed узлов.")
    }
}
class Cargo(
    name: String,
    speed: Int,
): Ship(name,speed) {
    val capacity = 200
    val spaciousness = 400
    fun infoCargo() {
        println("Может перевозить груз массой до $capacity тонн, объемом $spaciousness литров.\n")
    }
}
class Icebreaker (
    name: String,
    speed: Int,
): Ship(name,speed) {
    val weight = 21000
    val length = 150
    fun specialFunctional() {
        println("Может колоть лед.")
    }
    fun infoIcebreaker() {
        println("Имеет водоизмещение $weight тонн и длину $length метров.")
        specialFunctional()
    }
}
fun main() {
    val cargo1 = Ship("Адмирал", 20)
    cargo1.movement()
    Cargo("Адмирал", 20).infoCargo()
    val icebreaker1 = Ship("Профессор Шварценгольд", 10)
    icebreaker1.movement()
    Icebreaker("Профессор Шварценгольд", 10).infoIcebreaker()

}
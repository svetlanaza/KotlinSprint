package lesson_17

class Ship(name: String, averageSpeed: Int, port: String) {
    var name = "fastShip"
        set(value) {
            println("Имя корабля менять нельзя!")
        }
    var averageSpeed = averageSpeed
    var port = port
}

fun main() {
    val ship = Ship("slowSip", 200, "Владивосток")

    println("Корабль ${ship.name} имеет среднюю скрость ${ship.averageSpeed}, порт приписки ${ship.port}")
    println(ship.name)

    ship.name = "slowShip"

    println(ship.name)
}
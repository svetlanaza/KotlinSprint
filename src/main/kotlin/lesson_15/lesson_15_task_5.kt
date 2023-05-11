package lesson_15

interface Movable {
    fun move()
}

interface CargoTransportable {
    val maxCargo: Int
    fun transportCargo()
}

interface PassengerTransportable {
    val maxPassenger: Int
    fun transportPassenger()
}

class Car(numberPassenger: Int) : Movable, PassengerTransportable {
    override val maxPassenger = 3
    val passenger = numberPassenger

    override fun transportPassenger() {
        if (passenger <= maxPassenger) {
            println("Машина перевозит $passenger пассажира/пассажиров")
        }
    }

    override fun move() {
        transportPassenger()
    }

}

class CargoCar(numberPassenger: Int, amountWeight: Int) : Movable, PassengerTransportable, CargoTransportable {
    override val maxPassenger = 1
    val passenger = numberPassenger

    override fun transportPassenger() {
        if (passenger <= maxPassenger) {
            println("Грузовик перевозит $passenger пассажира/пассажиров")
        }
    }

    override val maxCargo = 2
    val weight = amountWeight
    override fun transportCargo() {
        if (weight <= maxCargo) {
            println("Грузовик перевозит $weight  тонну/тонн груза")
        }
    }

    override fun move() {
        transportPassenger()

    }
}

fun main() {
    val car = Car(3)
    val cargo = CargoCar(1, 1)
    car.transportPassenger()
    cargo.transportPassenger()
    cargo.transportCargo()
}
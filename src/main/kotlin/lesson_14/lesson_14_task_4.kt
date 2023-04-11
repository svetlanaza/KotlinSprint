package lesson_14

open class CelestialBody(
    val name: String,
    val atmosphere: Boolean = false,
    val habitable: Boolean = false,
    val possibleExit: Boolean = false,
    val water: Boolean = false,

    )

class Planet(
    name: String,
    atmosphere: Boolean,
    habitable: Boolean,
    possibleExit: Boolean,
    water: Boolean,
    val sputnik: Int?,
) : CelestialBody(name, atmosphere = true, possibleExit = true) {
    fun printPlanetInfo() {
        println("Планета $name имеет $sputnik спутника:")
    }
}

class Sputnik(
    name: String,
    atmosphere: Boolean,
    habitable: Boolean,
    possibleExit: Boolean,
    water: Boolean,
) : CelestialBody(name, atmosphere = true) {
    fun printName() {
        println(name)
    }
}

fun main() {
    val planet1 = Planet("Сатурн",
        atmosphere = true,
        habitable = false,
        possibleExit = true,
        water = false,
        sputnik = 2
    )
    planet1.printPlanetInfo()
    val sputnik1 = Sputnik("Титан", true,  true, false,  false)
    sputnik1.printName()

    val sputnik2 = Sputnik("Диона", true, false, true, false)
    sputnik2.printName()
}
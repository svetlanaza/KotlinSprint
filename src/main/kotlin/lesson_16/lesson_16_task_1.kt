package lesson_16

class Cube {
    private val number = (1..6).random()
    fun printNumber() {
        println(number)
    }
}

fun main() {
    val numeric = Cube()
    numeric.printNumber()
}
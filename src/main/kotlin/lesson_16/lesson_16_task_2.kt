package lesson_16

class Circle(private val radius: Int) {
    private val pi = 3.14

    fun printRadius() {
        println("Радиус круга равен $radius")
    }

    fun circumference(): Double {
        return 2 * pi * radius
    }

    fun area(): Double {
        return pi * radius * radius
    }
}

fun main() {
    val circle = Circle(7)

    circle.printRadius()
    println("Длина окружности равна ${circle.circumference()}")
    println("Площадь круга равна ${circle.area()}")
}
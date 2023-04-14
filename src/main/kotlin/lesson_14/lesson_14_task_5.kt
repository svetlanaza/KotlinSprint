package lesson_14

abstract class Figure(val color: String) {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Circle(
    color: String,
    val diameter: Double,
) : Figure(color) {
    override fun area() = Math.PI * diameter / 2 * diameter / 2
    override fun perimeter() = Math.PI * diameter
    }

class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure(color) {
    override fun area() = width * height
    override fun perimeter() = 2 * (width + height)
    }

class Triangle(
    color: String,
    val sideLength1: Double,
    val sideLength2: Double,
    val sideLength3: Double,
) : Figure(color) {
    override fun area(): Double {
        val h = perimeter() / 2
        return  (h * (h - sideLength1) * (h - sideLength2) * (h - sideLength3))
    }

    override fun perimeter() = sideLength1 + sideLength2 + sideLength3
    }

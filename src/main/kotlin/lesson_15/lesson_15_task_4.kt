package lesson_15

interface Search {
    fun searchProduct() {
        println("Выполняется поиск товара.")
    }
}

abstract class Product(name: String, number: Int) {
    val name = name
    val number = number
}

class Instrument(name: String, number: Int) : Product(name, number), Search
class Accessories(name: String, number: Int) : Product(name, number), Search

fun main() {
    val guitar = Instrument("Гитара", 14)
    val item = Accessories("Струны", 5)

    guitar.searchProduct()
    println("${guitar.name} - ${guitar.number} шт")

    guitar.searchProduct()
    println("${item.name} - ${item.number} шт")

}
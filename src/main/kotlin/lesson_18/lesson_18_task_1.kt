package lesson_18

open class Order() {
    val id = (1..99).random()
    open fun showOrder() {

    }
}

class OrderItem(private var goods: String): Order() {
    override fun showOrder() {
        println("Заказан товар: $goods")
    }
}

class OrderGoods(private var goods: List<String>): Order() {
    override fun showOrder() {
        println("Заказаны следущие товары: $goods")
    }
}

fun main() {
    var order: Order = OrderItem("Краска")
    var order1: Order = OrderGoods(listOf(" Ламинат, обои, плинтус"))
    order.showOrder()
    order1.showOrder()
}
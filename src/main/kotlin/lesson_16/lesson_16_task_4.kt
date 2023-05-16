package lesson_16

class Order(var statusReadiness: Boolean) {

    private val numberOrder = 1

    fun orderInfo() {
        println("Номер закза $numberOrder")
        if (statusReadiness == false) {
            println("Заказ обрабатывается")
        } else {
            println("Заказ готов")
        }
    }

    fun orderChange() {
        println("Менеджер оставил заявку об изменении статуса заказа")
    }

}

fun main() {
    var order = Order(false)
    order.orderInfo()
    order.orderChange()
    order = Order(true)
    order.orderInfo()

}
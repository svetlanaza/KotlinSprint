package lesson_16

class Order {
    var statusReadiness = false
    private val numberOrder = 1

    fun orderInfo() {
        println("Номер закза $numberOrder")
    }

    //fun  changeStatus()
    fun requestOnChange(newStatus: Boolean) {
        println("Заказ готов!")

    }
}

fun main() {
    val order = Order()
    order.orderInfo()
    order.requestOnChange(true)
}
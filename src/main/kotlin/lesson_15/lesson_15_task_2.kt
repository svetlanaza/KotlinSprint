package lesson_15

//abstract class Message {
//    abstract val text: String
//    fun connect() {
//        println("Подключение к серверу")
//    }
//
//    fun send() {
//        println("${text}")
//        println("Сообщение отправлено")
//    }
//}
//
//class MessageTemperature(data: Int) : Message() {
//    override val text = "Температура - ${data} градусов"
//}
//
//class MessagePrecipitation(data: Int) : Message() {
//    override val text: String = "Осадков - ${data} градусов"
//
//}
//
//fun main() {
//    val message1 = MessageTemperature(14)
//    val message2 = MessagePrecipitation(30)
//
//    message1.connect()
//    message1.send()
//    message2.connect()
//    message2.send()
//
//}
abstract class Message {
    abstract val text: Int
    abstract fun connect()
    abstract fun send()
}
class MessageTemperaturePrecipitation(override val text: Int) : Message() {
    override fun connect() {
        println("Температура - $text градусов")
        println("Подключение к серверу")
    }

    override fun send() {
        println("Количество осадков $text мм")
        println("Сообщение отправлено")
    }
}
fun main () {
    val message1 = MessageTemperaturePrecipitation(14)
    val message2 = MessageTemperaturePrecipitation(30)

    message1.connect()
    message2.send()

}



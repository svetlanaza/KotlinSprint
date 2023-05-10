package lesson_15

abstract class Message {
    abstract val text: String
    abstract fun connect ()
    abstract fun send()
}
class MessageTemperature (override val text: String) : Message() {
    override fun connect() {
        println("Подключение к серверу")
    }
    override fun send() {
        println(text)
        println("Сообщение отправлено")
    }
}
class MessagePrecipitation()
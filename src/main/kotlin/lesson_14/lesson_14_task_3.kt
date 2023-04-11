package lesson_14

open class Message (
    val text: String,
    val author: String,
) {
    fun printPost() {
        println("\"$text\"")
        println("$author \n")
    }
}
class Comment(
    author: String,
    text: String,
    val info: String,
): Message(author, text) {

    fun printComment() {
        println("$info \n")
        println(author)
        println(text)

    }
}
fun main() {
    Message("Космические корабли", "Петров").printPost()
    Comment("Сидоркин", "Спорные вопросы относительно данных характерристик",
        "Описание основных характеристик космических кораблей").printComment()
}
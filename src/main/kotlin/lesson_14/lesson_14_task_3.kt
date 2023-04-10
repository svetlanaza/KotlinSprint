package lesson_14

open class Massage (
    val text: String,
    val author: String,
) {
    fun publication() {
        println("\"$text\"")
        println("$author \n")
    }
}
class Comment(
    author: String,
    text: String,
    val info: String,
): Massage(author, text) {

    fun commentPost() {
        println("$info \n")
        println(author)
        println(text)

    }
}
fun main() {
    Massage("Космические корабли", "Петров").publication()
    Comment("Сидоркин", "Спорные вопросы относительно данных характерристик",
        "Описание основных характеристик космических кораблей").commentPost()
}
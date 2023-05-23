package lesson_17

class QuizItem(question: String, answer: String) {
    var question = question
        set(value) {
            field = value
        }

    var answer: String = answer
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val quizItem = QuizItem("Как называется столица Японии?", "Токио")
    println("Вопрос: ${quizItem.question}")
    println("Ответ: ${quizItem.answer}")

    quizItem.answer = "Киото"
    println("Новый ответ: ${quizItem.answer}")
}

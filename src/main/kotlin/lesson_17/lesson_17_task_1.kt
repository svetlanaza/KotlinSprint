package lesson_17

class Quiz(question: String, answer: String) {
    var question = "Какая столица Франции"
        set(value) {
            field = value
        }

    var answer = "Париж"
        get() = field
        set(value: String) {
            field = "dfdfdfd"
        }
}

fun  main() {
    var quiz = Quiz("Столица Англии", "Лондон")
    println(quiz.question)
    println(quiz.answer)
}
package lesson_10

fun main() {
    println("Бросайте кости!")
    val userThrow = throwBones()

    println("Мой ход")
    val kompThrow = throwBones()


    if (userThrow > kompThrow) {
        println("Победило человечество!")

    } else if (userThrow == kompThrow) {
        println("Ничья")
    } else {
        println("Победила машина!")
    }
}
fun throwBones(): Int {
    val number1 = (1..6).random()
    println(number1)
    val number2 = (1..6).random()
    println(number2)
    return number1 + number2
}

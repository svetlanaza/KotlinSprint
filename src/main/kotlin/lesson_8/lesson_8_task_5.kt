package lesson_8

fun main() {
    println("Сколько ингредиентов будет в вашем блюде?")
    val ingredientsNumber = readLine()!!.toInt()
    var counter = ingredientsNumber
    val dish = Array<String>(ingredientsNumber) { "" }

    while (counter > 0) {
        println("Введите ингредиент")
        var ingredient = readLine()!!.toString()
        counter--
    }
    println("В вашем блюде такие ингредиенты:")
    while (counter > 0) {
        println(dish)

        counter--

    }
}


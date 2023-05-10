package lesson_8

fun main() {
    println("Сколько ингредиентов будет в вашем блюде?")
    val ingredientsNumber = readLine()!!.toInt()
    var dish = Array<String>(ingredientsNumber) { "" }


    for (i in 0 until dish.size) {
        println("Введите ингредиент")
        dish[i] = readLine().toString()

    }

    println("В вашем блюде такие ингредиенты:")

    for (i in 0 until dish.size) {
        println(dish[i])
        }

    }











package lesson_9

fun main() {
    val salad = mutableListOf("яйцо", "кальмар", "зелень")
    println("В рецепте есть базовые ингредиенты:")
    salad.forEach {
        println(it)
    }
    println("Желаете добавить еще?")

    val userResponse = readLine()!!.toString()

    if (userResponse == "да") {
        println("Введите ваш ингредиент")
    } else {
        return
    }
    val newIngredient = readLine()!!.toString()

    salad.add(newIngredient)
    println("Теперь в рецепте такие ингредиенты:")
    salad.forEach {
        println(it)
    }
}
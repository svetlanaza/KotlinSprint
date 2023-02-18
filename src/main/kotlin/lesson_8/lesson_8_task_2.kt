package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("мясо", "лук", "соль", "перец")
    println("Какой ингредиент вы хотите найти?")
    val ingredient = readLine()

    for (i in arrayOfIngredients) {
        if (ingredient == i) {
            println("Ингредиент $ingredient в рецепте есть")
            break

        } else {
            println("Такого ингредиента в рецепте нет")

        }
    }
}
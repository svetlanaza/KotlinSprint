package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("мясо", "лук", "соль", "перец")
    println("Какой ингредиент вы хотите найти?")
    val ingredient = readLine()
    for (i in arrayOfIngredients) {
        arrayOfIngredients
        if (arrayOfIngredients[0] == ingredient || arrayOfIngredients[1] == ingredient || arrayOfIngredients[2] == ingredient || arrayOfIngredients[3] == ingredient) {
            println("Такой ингредиент в рецепте есть")
            break
        } else {
            println("Такого ингредиента в рецепте нет")
            break
        }
    }
}
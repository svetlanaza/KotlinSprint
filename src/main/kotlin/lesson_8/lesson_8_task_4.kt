package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("мясо", "лук", "соль", "перец")
    println(arrayOfIngredients[0])
    println(arrayOfIngredients[1])
    println(arrayOfIngredients[2])
    println(arrayOfIngredients[3])
    println("Какой ингредиент вы хотите заменить?")
    val ingredient = readLine()

    arrayOfIngredients.indexOf(ingredient)

    if (arrayOfIngredients[0] == ingredient || arrayOfIngredients[1] == ingredient || arrayOfIngredients[2] == ingredient || arrayOfIngredients[3] == ingredient) {
        println("На какой ингредиент вы хотите замменить?")

    } else {
        println("Такого ингредиента в рецепте нет")

    }
}

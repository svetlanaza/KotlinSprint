package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("мясо", "лук", "соль", "перец")
    println(arrayOfIngredients[0])
    println(arrayOfIngredients[1])
    println(arrayOfIngredients[2])
    println(arrayOfIngredients[3])

    println("Какой ингредиент вы хотите заменить?")
    val ingredient = readLine()!!.toString()


    println("На какой ингредиент вы хотите заменить $ingredient?")

    val ingredientChange = readLine()!!.toString()
    arrayOfIngredients[arrayOfIngredients.indexOf(ingredient)] = ingredientChange

    println(arrayOfIngredients[0])
    println(arrayOfIngredients[1])
    println(arrayOfIngredients[2])
    println(arrayOfIngredients[3])

}

package lesson_9

fun main() {
    val freshDrink = listOf("имбирь", "лимон", "вода", "мед", "корица")
    println("В рецепте есть следующие ингредиенты:")
    freshDrink.forEach {
        println(it)
    }
}

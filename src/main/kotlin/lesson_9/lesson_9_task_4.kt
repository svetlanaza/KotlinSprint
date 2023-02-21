package lesson_9

fun main() {
    val dish = mutableListOf<String>()
    println("Введите 5 названий ингредиентов через запятую")


    for (i in 1..5) {
        dish.add(readLine().toString())

    }


    dish.sort()
    dish.forEach {
        println(it)
    }



}
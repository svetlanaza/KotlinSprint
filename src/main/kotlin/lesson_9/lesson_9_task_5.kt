package lesson_9

fun main() {
    val dish = mutableListOf<String>()

    for (i in 1..5) {
        println("Введите ингредиент")
        dish.add(readln().toString())
    }
        dish.sort()

        print(dish[0].capitalize() + ", " + dish[1] + ", " + dish[2] + ", " + dish[3] + ", " + dish[4] + ".")

    }

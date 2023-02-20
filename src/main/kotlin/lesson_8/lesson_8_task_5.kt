package lesson_8

fun main() {
    println("Сколько ингредиентов будет в вашем блюде?")
    val ingredientsNumber = readLine()!!.toInt()
    var counter = ingredientsNumber


    while (counter > 0) {
        println("Введите ингредиент")
        val ingredient = readLine()!!.toString()
        counter--


    }
    var dish = Array<String>(ingredientsNumber) { String() }
    println("В вашем блюде такие ингредиенты:")

    for (i in 0 until dish.size) {

        println(dish[i])

    }

}









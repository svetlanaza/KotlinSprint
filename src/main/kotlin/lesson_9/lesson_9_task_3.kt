package lesson_9

fun main() {
    val omelette = mutableListOf(2, 50, 15)
    println("Сколько порций омлета вы хотите приготовить?")

    val number = readLine()!!.toInt()
    val egg = omelette[0] * number
    val milk = omelette[1] * number
    val butter = omelette[2] * number

    println("Для  $number порций омлета, вам понадобится: $egg шт яиц, $milk мл молока, $butter гр сливочного масла")
}
package lesson_2

fun main() {
    val departHour = 9
    val departMinutes = 39
    val travelOfTime = 457
    val depart = departHour * 60 + departMinutes
    val arrival = depart + travelOfTime
    val arrival1 = arrival / 60
    val arrival2 = arrival % 60

    print(arrival1)
    print(":")
    print(arrival2)
}
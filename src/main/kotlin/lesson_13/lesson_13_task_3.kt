package lesson_13

class PhoneBook(
    val name: String?,
    val phoneNumber: Int?,
    val company: String?,
) {
    fun print() {
        println("${name ?: "[Не указано]"} \n${phoneNumber ?: "[Не указано]"} \n${company ?: "[Не указано]"} \n")
    }
}

fun main() {
    val mutableList = mutableListOf(
        PhoneBook("Евгения", 123456789, "Газпром").print(),
        PhoneBook("Кирилл", 456990900, null).print(),
        PhoneBook("Алена", null, null).print(),
        PhoneBook("Макс", null, "Лукоил").print(),
    )
}
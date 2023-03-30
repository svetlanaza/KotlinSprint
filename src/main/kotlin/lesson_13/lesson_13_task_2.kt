package lesson_13

class Contact(
    val name: String,
    val phoneNumber: Int,
    val company: String?,
) {
    fun print() {
        println("$name \n$phoneNumber \n${company ?: "[Не указана]"} \n")
    }
}

fun main() {
    val person1 = Contact(
        "Ирина",
        1234567727,
        null
    )
    person1.print()

    val person2 = Contact(
        "Ольга",
        456788727,
        "Apple"
    )
    person2.print()
}
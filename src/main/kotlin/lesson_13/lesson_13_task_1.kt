package lesson_13

class Contacts(
    val name: String,
    val phoneNumber: Int,
    val company: String?,
)

fun main() {
    val person1 = Contacts(
        "Ирина",
        1234567727,
        null
    )

    val person2 = Contacts(
        "Ольга",
        456788727,
        "Apple"
    )
}
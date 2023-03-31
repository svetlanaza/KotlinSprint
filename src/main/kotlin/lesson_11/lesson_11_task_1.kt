package lesson_11

fun main() {
    val user1 = Users(
        id = 1,
        name = "Роман",
        login = "roman@mail.com",
        password = "qwerty123"
    )

    val user2 = Users(
        id = 2,
        name = "Ольга",
        login = "olga@mail.com",
        password = "qwerty456"
    )

    println(user1.id)
    println(user1.name)
    println(user1.login)
    println(user1.password)
    println()
    println(user2.id)
    println(user2.name)
    println(user2.login)
    println(user2.password)

}
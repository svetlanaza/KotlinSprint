package lesson_15

abstract class GeneralUser(name: String) {
    val person = name
    fun read() {
        println("$person читает форум")
    }

    fun write(text: String) {
        println("$person написал сообщение: \"$text\"")
    }
}

class User(name: String) : GeneralUser(name)

class AdminUser(name: String) : GeneralUser(name) {

    fun deleteMessage(user: User) {
        println("Админ $person удалил сообщение пользователя ${user.person}")
    }

    fun deleteUser() {
        println("Админ $person удалил пользователя за нарушения правил")
    }
}

fun main() {
    val user1 = User("Роман")
    val user2 = User("Василий")
    val admin = AdminUser("Евгений")
    user1.read()
    user1.write("Продаю автоммобиль!")
    admin.read()
    admin.deleteMessage(user1)
    admin.deleteUser()
    user2.write("Поздравляю всех с Новым годом!")
    admin.read()
}
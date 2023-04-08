package lesson_13
class Person (name: String?,number: Long, company: String?) {

        fun addPerson(persons: MutableList<Person>) {
            var name: String? = null
            val number: Long
            var company: String? = null

            println("Введите имя")
            val contactName = readLine().toString()
            if (contactName.length != 0) {
                name = contactName
            }
            println("Введите номер")
            val contactNumber = readLine().toString()
            if (contactNumber.length == 0) {
                println("Поле, необходимое для заполнения!")
                return
            }  else {
                number = contactNumber.toLong()
            }
            println("Введите компанию")
            val contactCompany = readLine().toString()
            if (contactCompany.length != 0) {
                company = contactCompany
            }
            val person = Person(name, number, company)
            persons.add(person)

            println("${name ?: "[Не указано]"} \n$number  \n${company ?: "[Не указано]"} \n")

            }

        }
fun main() {
    val persons = mutableListOf<Person>()

    println("Хотите добавить контакт?")

    while (true) {
        val answer = readLine().toString()
        if (answer != "Да") {
            break
        } else {
            Person(null, 0, null).addPerson(persons)

        }

    }
}


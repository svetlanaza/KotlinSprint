package lesson_17

class PackageBox(number: Int, place: String) {
    var counter = 1
    var number = number
    var place = place
        set(value) {
            field = value
            counter++
        }
}

fun main() {
    val packageBox = PackageBox(2, "Paris")
    println(packageBox.counter)
    println(packageBox.place)

    packageBox.place = "Rome"
    println(packageBox.counter)
    println(packageBox.place)

    packageBox.place = "Napoli"
    println(packageBox.counter)
    println(packageBox.place)

}
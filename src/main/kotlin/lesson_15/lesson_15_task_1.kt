package lesson_15

interface Flying {
    fun fly()
}

interface Swimming {
    fun swim()
}

class Seagull : Flying {
    override fun fly() {
        println("Чайка умеет летать.")
    }
}

class Crucian : Swimming {
    override fun swim() {
        println("Карась уммеет плавать.")
    }
}

class Duck : Flying, Swimming {
    override fun fly() {
        println("Утка умеет летать.")
    }

    override fun swim() {
        println("Утка уммеет плавть.")
    }

}

fun main() {
    val seagull = Seagull()
    seagull.fly()

    val crucian = Crucian()
    crucian.swim()

    val duck = Duck()
    duck.fly()
    duck.swim()
}
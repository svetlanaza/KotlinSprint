package lesson_16

class Gamer(
    val name: String,
    var impactForce: Int,
    var health: Int,
    private var isDead: Boolean,
) {

    fun takeDamage(damage: Int) {
        if (!isDead) {
            health -= damage
        }
        if (health <= 0) {
            dead()
        }
    }

    fun takeTreatment(treatment: Int) {
        if (!isDead) {
            health += treatment
        }
    }

    private fun dead() {
        isDead = true
        impactForce = 0
        health = 0
        println()
        println("$name погиб!")

    }
}

fun main() {
    val gamer = Gamer("Jon", 3, 5, false)
    println(("${gamer.name} начинает игру."))

    gamer.takeDamage(2)
    println("${gamer.name} получил 2 урона. Здоровье: ${gamer.health}")

    gamer.takeTreatment(8)
    println("${gamer.name} восстановил 8 здоровья. Здоровье: ${gamer.health}")

    gamer.takeDamage(12)
    println("${gamer.name} получил 12 урона. Здоровье: ${gamer.health}")
}
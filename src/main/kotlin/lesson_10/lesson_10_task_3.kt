package lesson_10

fun main() {

   val password = passwordCreation(9)

   }
fun passwordCreation(number : Int) :String {
   var password = ""
   println("Пароль какой длины вы хотите использовать?")
   val passwordLength = readLine()!!.toInt()

   for (i in 0 until passwordLength) {
      val simbol = (0..1).random()

      if (simbol == 0) password += (0..9).random()
      if (simbol == 1) password += ('#'..'~').random()

   }
   return password

}

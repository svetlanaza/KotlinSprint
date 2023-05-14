package lesson_2

fun main() {
    val employees = 50
    val salaryEmployee = 30000
    val expensesSalary = employees * salaryEmployee

    println(expensesSalary)

    val trainees = 30
    val salaryTrainee = 20000
    val expensesSalaryTrainee = trainees * salaryTrainee

    println(expensesSalary + expensesSalaryTrainee)
    println((expensesSalary + expensesSalaryTrainee) / (employees + trainees))
}
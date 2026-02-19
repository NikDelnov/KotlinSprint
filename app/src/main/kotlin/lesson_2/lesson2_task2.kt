package lesson_2

fun main() {
    val regularEmployees = 50
    val regularSalary = 30000
    val interns = 30
    val internsSalary = 20000

    val regularExpenses = regularEmployees * regularSalary
    val totalExpenses = (regularEmployees * regularSalary) + (interns * internsSalary)
    val averageSalary = totalExpenses / (regularEmployees + interns)

    println(regularExpenses)
    println(totalExpenses)
    println(averageSalary)

}
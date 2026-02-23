package lesson_2

fun main () {
    val score1 = 3
    val score2 = 4
    val score3 = 3
    val score4 = 5

    val studentCount = 4

    val sum = score1 + score2 + score3 + score4

    val averageScore = sum / studentCount.toDouble()

    println("%.2f".format(averageScore))
}
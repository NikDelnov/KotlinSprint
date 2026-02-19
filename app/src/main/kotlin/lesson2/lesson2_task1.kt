package lesson2

fun main () {
    val score1 = 3
    val score2 = 4
    val score3 = 3
    val score4 = 5

    val averageScore = (score1 + score2 + score3 + score4) / 4.0

    println("%.2f".format(averageScore))
}
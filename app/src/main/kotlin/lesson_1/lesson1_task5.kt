package lesson_1

fun main () {
    val secondsInMinute = 60
    val minutesInHour = 60
    val secondsInHour = secondsInMinute * minutesInHour

    val totalSeconds: Int = 6480

    val hours = totalSeconds / secondsInHour
    val minutes = (totalSeconds % secondsInHour) / secondsInMinute
    val seconds = totalSeconds % secondsInMinute

    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}
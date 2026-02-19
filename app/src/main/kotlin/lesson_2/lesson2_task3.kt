package lesson_2

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinutes = 457

    val totalMinutes = (departureHour * 60 + departureMinute + travelTimeMinutes) % 1440

    println("%02d:%02d".format(totalMinutes / 60, totalMinutes % 60))
}
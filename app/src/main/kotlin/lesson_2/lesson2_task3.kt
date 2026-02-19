package lesson_2

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinutes = 457

    val minutesInHour = 60
    val hoursInDay = 24
    val minutesInDay = hoursInDay * minutesInHour

    val departureInMinutes = departureHour * minutesInHour + departureMinute

    val arrivalInMinutes = (departureInMinutes + travelTimeMinutes) % minutesInDay

    val arrivalHour = arrivalInMinutes / minutesInHour
    val arrivalMinute = arrivalInMinutes % minutesInHour

    println("%02d:%02d".format(arrivalHour, arrivalMinute))
}
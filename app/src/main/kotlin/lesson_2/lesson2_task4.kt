package lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11

    // Расчет бонуса (20% = 0.2)
    val bonusCrystal = (crystalOre * 0.2).toInt()  // Отбрасываем дробную часть
    val bonusIron = (ironOre * 0.2).toInt()        // Отбрасываем дробную часть

    // Вывод результатов
    println("Кристаллическая руда: $bonusCrystal")
    println("Железная руда: $bonusIron")
}
fun main() {
    val amount = 570129
    val percent = 0.75
    val minCommission = 35_00
    val commission = amount * percent / 100
    if (commission < minCommission) println("Будет списанна минимальная комиссия: $minCommission копеек.") else println("Комиссия составит: ${commission.toInt()} копеек")
}
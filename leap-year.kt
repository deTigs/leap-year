
fun main() {
    println("Enter year:")
    val year = readlnOrNull()?.toIntOrNull()

    if (year != null) {
        val leapOrNot = if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) "$year is a leap year."
        else "$year not a leap year."
        println(leapOrNot)
    }
    else {
        println("Invalid input. Please enter a valid year.")
    }
}
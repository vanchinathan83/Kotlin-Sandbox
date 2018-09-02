// compile time constants
const val MAX_EXPERIENCE: Int = 5000

fun main(args: Array<String>) {
    // Kotlin can infer type from the assignment
    // Kotlin only supports reference types - but, converts those into primitives when compiling to get better performance.
    val playerName = "Bingo"
    var hasSteed = false
    var experiencePoints = 5

    experiencePoints += 5
    println(experiencePoints)
    println(playerName)
    println(hasSteed)
    println(playerName.reversed())
}
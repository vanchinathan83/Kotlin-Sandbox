fun main(args: Array<String>) {
    val playerName = "Bingo"
    var health = 100
    var immortal = false

    if(health >= 100){
        println("$playerName is in good condition.")
    }else if (health > 70){
        println("$playerName is in OK condition.")
    }
    else{
        println("$playerName is in awful condition.")
    }


    // conditional expressions
    // if statements can be turned into expression
    // one line if statements does not need braces
    val healthStatus = if(health == 100 || immortal) "is in good condition!!"
            else if (health > 70) "is in OK condition."
            else "is in awful condition."

    // String templates
    println("$playerName $healthStatus")

    // String templates can have expressions
    // ${if(someThing) "YES" else "NO"}


    // using ranges in if expressions avoids ordering of the if-else statements
    // until is a function to create a range and excludes upper bound
    // downTo is another method, but, creates the range in descending order
    val newHealthStatus = if(health == 100) "is in good condition."
        else if (health in 0.until(70)) " is in awful condition!!"
        else if (health in 70..99) " is in OK condition."
        else "something terrible happened!!"

    println("$playerName $newHealthStatus")

    // if expressions can be replaced by when expressions , if there is a else if block in your code
    val latestHealthStatus = getLatestHealthStatus(health)

    println("$playerName $latestHealthStatus")

}

private fun getLatestHealthStatus(health: Int): String {
    val latestHealthStatus = when (health) {
        100 -> "is in good condition."
        in 0.until(70) -> "is in awful condition."
        in 70.until(100) -> "is in OK condition."
        else -> "Something went wrong"
    }
    return latestHealthStatus
}
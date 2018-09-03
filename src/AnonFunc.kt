fun main(args: Array<String>) {

    // No return keywords are allowed in anon functions
    // When there is only one argument to the anon function, you can use $it
    // $it can be confusing. So. refrain from using it.Sometimes, it can be convenient
    val greetingFunction = { playerName: String, numBuildings: Int ->
        println("Num Buildings in City is $numBuildings")
        val currentYear = 2018
         "Welcome $playerName!! Copyright $currentYear"
    }

    // Have 10 a's in my name
    println("Vanchinathan Ayipalayam Chandrasekaran".count( {it == 'a'}))
    // Short hand syntax
    // Passing function references with ::
    println(runSimulation("Bingo",::printCosts){ playerName: String, numBuildings: Int ->
        println("Num Buildings in City is $numBuildings")
        val currentYear = 2018
        "Welcome $playerName!! Copyright $currentYear"
    })
}
private fun printCosts(numBuildings: Int) : Unit {
    println("Cost for $numBuildings is ${numBuildings * 500}")
}

private inline fun runSimulation(playerName: String,costPrinter: (Int) -> Unit, greetingFunc: (String, Int) -> String) : String {
    val numBuildings = (1..10).shuffled().last()
    costPrinter(numBuildings)
    return greetingFunc(playerName,numBuildings)
}
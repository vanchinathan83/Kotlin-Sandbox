fun main(args: Array<String>) {
    var playerName = "Bingo"
    var health = 100
    var immortal = false

    if(health >= 100){
        println(playerName + " is in good condition.")
    }else if (health > 70){
        println(playerName + " is in OK condition.")
    }
    else{
        println(playerName + " is in awful condition.")
    }


    // conditional expressions
    // if statements can be turned into expression
    // one line if statements does not need braces
    val healthStatus = if(health == 100 || immortal) "is in good condition!!"
            else if (health > 70) "is in OK condition."
            else "is in awful condition."

    println(playerName + " " + healthStatus)
}
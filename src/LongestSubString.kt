fun main(args: Array<String>) {
    println(longestSubstring("dvdf"))
}

private fun longestSubstring(input: String = "bbbbbb"): Int {
    var tempSubstring = ""
    var longestSubstrLength = 0
    input.asSequence().forEach { c ->
        if(!tempSubstring.contains(c)){
            tempSubstring = tempSubstring.plus(c)
        } else {
            longestSubstrLength = if(tempSubstring.length > longestSubstrLength) tempSubstring.length else longestSubstrLength
            tempSubstring = tempSubstring.substringAfter(c).plus(c)
        }
    }
    return if(tempSubstring.length > longestSubstrLength) tempSubstring.length else longestSubstrLength
}
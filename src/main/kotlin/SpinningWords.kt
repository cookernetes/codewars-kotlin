fun main() {
    val testStr = "Hey fellow warriors"
    val strippedString = testStr.split(" ")

    var outcome = ""
    for ((i, x) in strippedString.withIndex()) {
        outcome += when {
            x.length >= 5 && i == strippedString.size - 1 -> x.reversed()
            x.length >= 5 -> "${x.reversed()} "
            i == strippedString.size - 1 -> x
            else -> "$x "
        }
    }

    print(outcome)
}
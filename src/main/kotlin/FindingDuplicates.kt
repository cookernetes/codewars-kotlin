fun main() {
//    Map approach to duplicates
    val testStr = "abcde"
    val charMap = mutableMapOf<Char, Int>()
    for (x in testStr) if (x in charMap) charMap.set(x, charMap.get(x)!! + 1) else charMap.set(x, 1)

    print(charMap.filter{ it.value > 1 }.size)
}
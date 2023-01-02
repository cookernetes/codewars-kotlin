fun check(n: Int) = when {
    n < 0 -> 0
    n > 255 -> 255
    else -> n
}
fun formatStr(str: String) = str.padStart(2, '0')
fun rgb(r: Int, g: Int, b: Int): String = "${formatStr(check(r).toString(16))}${formatStr(check(g).toString(16))}${formatStr(check(b).toString(16))}".uppercase()

fun main() {
    print(rgb(255, 255, -255))
}
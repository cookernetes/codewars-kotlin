fun main() {
    val exampleData = arrayOf(206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781)

    val even = exampleData.filter { it % 2 == 0 }
    val odd = exampleData.filter { it % 2 != 0 }

    print(if (even.size > 1) odd[0] else even[0])
}
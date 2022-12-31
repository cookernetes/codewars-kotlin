fun toCamelCase(str:String):String = if (str.length == 0) "" else {
    str.split("[_-]".toRegex())
        .mapIndexed{ i, x ->
            if (i != 0) x[0].uppercase() + x.substring(1)
            else x
        }
        .joinToString("")
}

fun main() {
    print(toCamelCase("the-stealth-warrior"))
}


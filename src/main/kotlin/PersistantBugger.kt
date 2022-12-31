fun main() {
    /*
    * 39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
    * 999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
    * 4 --> 0 (because 4 is already a one-digit number)
    */

    var num = 999
    if (!(num.toString().length > 1)) print(0) else {
        var count = 0

        while (true) {
            if (num.toString().length == 1) break
            num = num.toString().chunked(1).map{ it.toInt() }.reduce{ acc, i ->  acc * i }
            count++
        }

        print(count)
    }
}
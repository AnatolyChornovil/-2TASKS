package NEW

fun main() {
    var matrix = arrayOf<Array<Int>>()
    for (i in 0..4) {
        var array = arrayOf<Int>()
        for (j in 0..4) {
            array + 1
        }
        matrix += array
    }
    for (array in matrix) {
        for (value in array) {
            print("$value ")
        }
        println()
    }

}
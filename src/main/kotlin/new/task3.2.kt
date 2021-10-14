fun main() {

    val rows = 2
    val columns  = 3
    val firstMatrix = arrayOf(intArrayOf(4,8,9), intArrayOf(2,5,6))
    val secondMatrix = arrayOf(intArrayOf(2,5,6), intArrayOf(4,8,9))

    val sum = Array(rows) {IntArray (columns)}
    for (i in 0..rows - 1){
        for (j in 0..columns - 1){
           sum[i][j] =  firstMatrix[i][j]   +   secondMatrix[i][j]
        }
    }
    println("Sum = ")
    for (row in sum){
        for (column in row){
            print("$column  ")
        }
        println()
    }
}

//https://www.codeblah.com/wp-content/uploads/2020/02/Annotation-2020-02-26-212413-5.png
// тре розібратися з цим
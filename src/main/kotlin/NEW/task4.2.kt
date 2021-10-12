package NEW

fun main() {
    val reader1 = Readers("Johnei Walker", 123, "SkotchMaker", 1810, 123456789)
    println("${reader1.takeBook()}, ${reader1.returnBook()} ")

}

class Readers (var name: String, var ticket: Int, var facult: String,
              var birth: Int, phone: Int){


    fun takeBook (): String {
        return "$name взяв книги"
    }

    fun returnBook (): String {
        return "$name повернув книги"
    }
class Books (var bookName: String, )

}
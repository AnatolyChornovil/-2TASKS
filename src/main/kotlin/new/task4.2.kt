package new

fun main() {

    val reader1 = Reader("Johnnie Walker", 123, "WhiskyMaker", 1867, 123456789)
    val reader2 = Reader("Jack Daniels", 124, "WhiskyMaker", 1810, 123987654)

    var books1 = mutableListOf(
        Book("Пригоди", "Кемерон"),
        Book("Словник", "Іваов"),
        Book("Енциклопедія", "Жежер")
    )
    var books2= mutableListOf(
        Book("Пригоди", "Кемерон"),
        Book("Енциклопедія", "Жежер")
    )

//    println(reader1.takesBooks(books1))
//    println(reader2.takesBooks(books1.size))

//
//    println(reader1.returneBooks(books1))
//    println(reader2.returneBooks(books1.size))



    val book1 = Book("Пригоди", "Кемерон")
    val book2 = Book("Словник", "Іваов")
    val book3 = Book("Енциклопедія", "Жежер")
    reader1.returneBooks(book1, book2, book3)

//    println(reader1.takesBooks(books1.size))
}
    class Reader(var name: String, var ticketID: Int, var facult: String, var birth: Int, var phone: Int) {

        fun takesBooks(num:Int) {
            println("$name взяв $num книг")
        }

        fun takesBooks(takesBooks: MutableList<Book>) {
            println("$name взяв ")

            for (Book in takesBooks){
                println(Book.bookName)
            }
        }

        fun takesBooks(vararg bober:Book) {
            println("$name взяв ")

            for (Book in bober){
                println(Book.bookName)
            }
        }

        fun returneBooks(num:Int) {
            println("$name повернув $num книг")
        }

        fun returneBooks(takesBooks: MutableList<Book>) {
            println("$name повернув ")

            for (Book in takesBooks){
                println(Book.bookName)
            }
        }

        fun returneBooks(vararg bober:Book) {
            println("$name повернув ")

            for (Book in bober){
                println(Book.bookName)
            }
        }

}
    class Book(var bookName: String, var author: String) {}



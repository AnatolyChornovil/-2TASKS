import java.nio.file.Files.walk

fun main() {
    var man = Person("Johnie Walker", 65)
    println("${man.walk()}, ${man.talk()}")
    var woman = Person()
    println("${woman.walk()}, ${woman.talk()}")
}

class Person(var fullName: String, var age: Int) {

    constructor(): this("", 0)

    fun walk(): String {
        return "$fullName ходить!"
    }

    fun talk(): String {
        return "Say! $fullName"
    }
}






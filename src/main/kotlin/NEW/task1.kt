package NEW
fun main() {
    val lg = Phone(1, "LG", 100.00)
    val sam = Phone(2, "Samsung", 120.00)
    val ip = Phone(3, "iPhone", 90.00)
    println("${lg.model}")
    println("${sam.model}")
    println("${ip.model}")

    lg.recieveCall("LG", "Mr.Neo", "0987654321")
    sam.recieveCall("Samsung", "Mr.Smith", "0978654312")
    ip.recieveCall("iPhone", "Mrs.Trinity", "0964513658")
}
class Phone constructor(val number : Int, val model : String, var weight : Double) {

    constructor (number: Int, model: String) : this(number, model,0.0) {
    }
    fun recieveCall(model: String, callerName:String, callNumber:String) {
        println("model: $model callerName: $callerName callNumber: $callNumber ")
    }
    constructor (number: Int, model: String, weight: Double,lenght :Double ) :
            this(4, "Shit", 110.00) {
    }
}


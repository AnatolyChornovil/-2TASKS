package new

fun main() {


}

open class Animal(var food:String, var location:String){

    open fun makeNoize(voice:String){
       println(" Animal спит")
    }

}
//class dog:Animal inner {
//    override fun makeNoize(voice:String){
//        println(" dog  спит")
//    }
//}
class cat(var food:String, var location:String){
}
class cow(var food:String, var location:String){
}

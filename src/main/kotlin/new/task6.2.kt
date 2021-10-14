package new

fun main() {
    var petya=Student("Petya", "Pupkin", "Gamer", 5.0)
    petya.getScholarship()
    var vasya=Student.Aspirant("Vasya", "Bro", "Lamer", 4.8, "Different")
    vasya.getScholarship()

    var students = listOf(
        Student ("Petya", "Pupkin", "Gamer", 5.0),
        Student.Aspirant("Vasya", "Bro", "Lamer", 4.8, "Different")
    )

//    students.getScholarship()
//    fun getScholarship (){
//        for (averageMark in students ){
//
//        }
//    }

}

data class Student(val firstName:String,
                   val lastName:String,
                   val group:String,
                   var averageMark:Double) {

    fun getScholarship(){
        if (averageMark >= 5.0){
        println("У $firstName $lastName cтипендія 100 грн")}
        else{
            println("У $firstName ${lastName}cтипендія 80 грн")
        }
    }
class Aspirant (val firstName:String,
                val lastName:String,
                val group:String,
                var averageMark:Double,
                val  scientificWork:String){
    fun getScholarship(){
        if (averageMark >= 5.0){
            println("У $firstName $lastName cтипендія 200 грн")}
        else{
            println("У $firstName $lastName cтипендія 180 грн")
        }
    }
}


}




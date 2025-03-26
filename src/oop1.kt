class person{
    var name = "Joe"
    var age = 34
    var location = "westlands " +
            "Nairobi"

    fun speak(){
        println("$name is speaking")
    }

}

fun main() {
    var doctor1 = person()
    doctor1.speak()
    println(doctor1.name)
    println(doctor1.location)
}
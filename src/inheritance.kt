class animal{
    var age = 12
    var gender = "male"

    fun makesound(){
        println("Animal is speaking")
    }
}
class dog{
    fun bark(){
        println("Dog is barking")
    }
}
class cat{
    fun meow(){
        println("cat is meowing")
    }
}

fun main() {
    var a = animal()
    var d = dog()
    var c = cat()
}
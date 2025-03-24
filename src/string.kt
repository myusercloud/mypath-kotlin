fun main() {
     var firstname = "Harry"
     var lastname = "Lucas"
    var text = "Hello there"
     println(firstname)
     println(lastname)
    println(firstname+ " " + lastname)//string conctenation
    println(text[0])
    println(firstname.uppercase())
    println(firstname.lowercase())

    //string interpolation
    println(text + " joe")
    println("my first name is $firstname")
    println("my full name is $firstname $lastname")

}
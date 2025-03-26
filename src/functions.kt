//functions -> block of code used to perform a task
fun main() {
    //standard-library functions / pre-defined functions

    var output = Math.sqrt(81.00)
    println("the square root of 81.00 is $output")

    var roundednumber = Math.round(34.80)
    println("${name()}the rounded value of 34.80 is $roundednumber")
    name()//calling a function
    add()
    employee("Harry",9000000,false)
    student("Harry",19,"MIT")
}

//user-defined functions
fun name (){
    println("Harry")
}
fun add(){
    var x = 20
    var y = 30
    println(x+y)
}
//parameters(variable) and arguments(value)
fun employee(name:String, salary:Int, disability:Boolean){
    println("Name:$name")
    println("Salary:$salary")
    println("Disability:$disability")
    println("$name is earning Ksh$salary. Disability status: $disability")
}

fun student(name: String, age: Int, course: String){
    println("$name is $age years old. He is studying $course")
}
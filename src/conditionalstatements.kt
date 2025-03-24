import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)
    println("Enter current room temp:")
    var temp = read.nextInt()

    if (temp < 25){
        println("It is Cold")
    }
    else{
        println("It is Warm")
    }
}
import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)
    print("Enter first number: ")
    var num1 = read.nextInt()

    print("Enter second number: ")
    var num2 = read.nextInt()

    print("Enter third number: ")
    var num3 = read.nextInt()

    var largest = if (num1 >= num2 && num1 >= num3) {
        num1
    }
    else if (num2 >= num1 && num2 >= num3) {
        num2
    }
    else {
        num3
    }

    println("The largest number is: $largest")
}

fun main() {
    print("Enter first number: ")
    val num1 = readLine()!!.toDouble()

    print("Enter second number: ")
    val num2 = readLine()!!.toDouble()

    print("Enter third number: ")
    val num3 = readLine()!!.toDouble()

    val largest = if (num1 >= num2 && num1 >= num3) {
        num1
    } else if (num2 >= num1 && num2 >= num3) {
        num2
    } else {
        num3
    }

    println("The largest number is: $largest")
}

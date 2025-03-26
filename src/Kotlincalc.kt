import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)

    println("Enter first number: ")
    var num1 = scanner.nextDouble()

    println("Enter an operator (+, -, *, /): ")
    var operator = scanner.next()[0]

    println("Enter second number: ")
    var num2 = scanner.nextDouble()

    var result = when (operator) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> if (num2 != 0.0) num1 / num2 else "Cannot divide by zero"
        else -> "Invalid operator"
    }

    println("Result: $result")
}

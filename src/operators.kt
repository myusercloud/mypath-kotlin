fun main(){
    //Arithmetic operators
    var a = 10
    var b = 5
    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)
    println(a % b)//modulus

    //comparison operators
    var x = 89
    var y = 100
    println(x < y)
    println(x > y)
    println(x <= y)
    println(x >= y)
    println(x == y)
    println(x != y)

    //assignment operators
    var num = 26
    println(num)

    num += 2
    println(num)

    //logical operators - &&, ||, !
    var number = 56
    println( number > 100 && num < 80)
    println( number > 100 || num < 80)
    println(!( number > 100 || num < 80))
}
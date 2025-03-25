fun main() {
    //while loop

    var num = 20
    while (num <= 25){
        println("Number: $num")
        num ++
    }


    //do while loop
    var count = 1
    do {
        println("count is $count")
        count ++
    }while (count <= 5)



    //for loop
    for (num in 100..105){
        println("Number is $num")
    }
    for (letter in 'a'..'d')
        println("letter is $letter")

    //break statement
    for (x in 10..15){
        if (x==12){
            break
        }
    }

    //continue statement
    for (myletter in 'a'..'d'){
        if (myletter == 'b'){
            continue
        }
    }
}
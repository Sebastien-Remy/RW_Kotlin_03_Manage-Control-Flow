fun main(args: Array<String>) {

    val visitedCountries = arrayOf(
        "Costa Rica", "Netherland", "USA", "Spain"
    )

    // While loop
    var i = 0
    while (i < visitedCountries.size) {
        println ("Contry at index $i: ${visitedCountries[i]}")
        i +=1
    }

    i = 0

    // Do while
    do {
        println ("Contry at index $i: ${visitedCountries[i]}")
        i +=1
    } while (i < visitedCountries.size)

    // Challenge
    i = visitedCountries.lastIndex
    while (i > 0) {
        println ("Contry at index $i: ${visitedCountries[i]}")
        i -=1
    }

    // For loop
    val range = 0..2
    println (range)

    val otherRange = 0 until 10
    println (otherRange)

    for (index in range) {
        println("${visitedCountries[index]}")
    }

    for (index in otherRange step 2) {
        println("$index")
    }

    for (index in 10 downTo  5) {
        println("$index")
    }

    for (index in 0..visitedCountries.lastIndex) {
        println("${visitedCountries[index]}")
    }

    for (country in visitedCountries) {
        print("$country ")
    }

    // For loop challenge
    val r1 = 10..20

    // Print 10 to 20 number
    for (n in r1) {
        println(n)
    }

    // Print 20 number step 3
    for (n in r1 step 3) {
        println(n)
    }

    // Print 15 to 0
    for (n in 30..15) {
        println(n)
    }

    // Iterate over collections
    // Exiting early
    val dayOfWeek = listOf(
        "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanch"
    )
    for (day in dayOfWeek) {
        if (day == "Mercredi")  {
            continue
        }
        if (day == "Samedi") {
            println ("Prepare for week-end")
            break
        }
        println(day)
    }

    val matrix = MutableList(5) { MutableList(5) {"*"} }
    for (row in 0..matrix.lastIndex) {
        for (col in 0..matrix.lastIndex) {
            matrix[row][col] = "$row:$col"
        }
    }
    println(matrix)

    // Label
    row@ for (row in 0..5) {
        column@ for (col in 0..5) {
            if (col == 2 && row == 2) {
                break@column // or @row
            }
            print ("x\t")
        }
        println()
    }

    // Challenge 2
    val matrixRow = 10
    val matrixCol = 10
    val gameMatrix = Array(matrixRow) { Array(matrixCol) {"."} }

    gameMatrix[1][2] = "X"
    for (row in 0..matrixRow-1) {
        for (col in 0..matrixCol-1) {
            print("${gameMatrix[row][col]}")
        }
        println()
    }

   mainloop@ for (row in 0 until matrixRow) {
        println ("Sarching in row $row")
        for (col in 0 until matrixCol) {
            if (gameMatrix[row][col] == "X") {
                println("Find X at row: $row, col: $col")
                break@mainloop
            }
        }
    }

    // Wehn
    var myAge = 50
    when (myAge) {
        25 -> println("Quater century")
        50 -> println("Half century")
        else -> {
            println ("Nothing to say")
        }
    }

    myAge = 14

    when (myAge) {
        in 0..12 -> println("Child")
        in 13..19 -> println("Teenager")
        in 20..60 -> println("Adult")
        else -> {
            println ("Old man")
        }
    }

    val message = when (myAge) {
        in 0..12 -> "Child"
        in 13..19 -> "Teenager"
        in 20..60 -> "Adult"
        else -> {
             "Old man"
        }
    }
    println(message)

    val email: String? = "mail@mail?com"
    val pword: String? = "iloveyouto"

    when {
        email == null || email.isEmpty() -> {
            println("You need an email")
        }
        "@" !in email -> {
            println("invalid email")
        }
        pword == null || pword.isEmpty() -> {
            println("You need a password")
        }
        pword.length < 10 -> {
            println("Password not strong")
        }
        else -> {
            print("Great all is ok")
        }
    }

    // Short version
    when {
        email == null || email.isEmpty() -> println("You need an email")
        "@" !in email ->  println("invalid email")
        pword == null || pword.isEmpty() -> println("You need a password")
        pword.length < 10 -> println ("Password not strong")
        else -> print("Great all is ok")
    }
    
}
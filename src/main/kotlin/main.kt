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
}
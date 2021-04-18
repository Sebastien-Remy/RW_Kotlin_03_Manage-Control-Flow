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

}
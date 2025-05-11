package wa.umiushi.kotlin_quest.contract

fun buyBeer(age: Int) {
    require(age >= 20)
    // buy
    val agreement = false
    check(agreement)
}
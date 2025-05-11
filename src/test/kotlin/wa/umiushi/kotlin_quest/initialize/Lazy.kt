package wa.umiushi.kotlin_quest.initialize

class Molasses {
    private val field: String by lazy {
        "lazy value"
    }

    fun say() {
        // initialize at accessing
        println(field)
    }
}
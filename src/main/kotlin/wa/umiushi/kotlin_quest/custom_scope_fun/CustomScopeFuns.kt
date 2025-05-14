package wa.umiushi.kotlin_quest.custom_scope_fun

inline fun <T> T.logScope(tag: String = "DEBUG", block: T.()-> Unit): T {
    println("[${tag}] Start:")
    block()
    println("[${tag}] End:")
    return this
}

inline fun <T> T.takeIfNotNullAnd(block: T.() -> Unit): T? {
    return if (this != null) {
        block()
        this
    } else null
}
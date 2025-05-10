package wa.umiushi.kotlin_quest.delegate

import kotlin.properties.Delegates

class User(name: String) {
    var name: String by Delegates.observable("noname") { property, oldValue, newValue ->
        println("${property.name} changed from $oldValue to $newValue")
    }

    init {
        this.name = name
    }
}
package wa.umiushi.kotlin_quest.delegate

import kotlin.test.Test

class PropertyDelegateTest {

    @Test
    fun observableTest() {
        val user = User("umiushi")
        user.name = "umiushi".reversed()
    }
}
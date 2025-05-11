package wa.umiushi.kotlin_quest.data_class

import kotlin.test.Test
import kotlin.test.assertSame

class SampleTest {

    @Test
    fun destructuringDeclarationsTest() {
        val user = User(1, "umiushi", "umiushi@example.com")
        // data class can be destructuring
        val (id, name, email) = user
        assertSame(1, id)
        assertSame("umiushi", name)
        assertSame("umiushi@example.com", email)
    }
}
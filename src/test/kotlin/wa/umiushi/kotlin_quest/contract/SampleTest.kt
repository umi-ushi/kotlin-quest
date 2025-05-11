package wa.umiushi.kotlin_quest.contract

import kotlin.test.Test
import kotlin.test.assertFailsWith

class SampleTest {

    @Test
    fun buyBeerTestUnderage() {
        assertFailsWith<IllegalArgumentException> {
            buyBeer(19)
        }
    }

    @Test
    fun buyBeerTestNonAgreement() {
        assertFailsWith<IllegalStateException> {
            buyBeer(23)
        }
    }
}
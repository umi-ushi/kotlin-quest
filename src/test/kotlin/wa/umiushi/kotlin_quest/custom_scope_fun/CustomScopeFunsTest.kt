package wa.umiushi.kotlin_quest.custom_scope_fun

import kotlin.test.Test

internal class CustomScopeFunsTest {

    @Test
    fun logScopeTest() {
        "sample".logScope {
            println("testing")
        }
    }

    @Test
    fun takeIfNotNullAndTest() {
        100.takeIfNotNullAnd {
            println(this * 2)
        }

        null.takeIfNotNullAnd {
            println(this)
        }
    }
}
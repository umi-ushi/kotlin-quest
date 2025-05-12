package wa.umiushi.kotlin_quest.measurement

import kotlin.system.measureTimeMillis

fun measureTotalTimeElapsed(
    itereations: Int,
    operation: (Int) -> Unit
): Long {
    return measureTimeMillis {
        repeat(itereations, operation)
    }
}
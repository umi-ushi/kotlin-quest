package wa.umiushi.kotlin_quest.measurement

import java.lang.Thread.sleep
import kotlin.test.Test

fun sampleOperation() {
    sleep(1)
}

class MeasureTest {
    @Test
    fun measure() {
        val iterations = 1_000
        val totalTime = measureTotalTimeElapsed(iterations) {
            sampleOperation()
        }

        println("Total time elapsed: ${totalTime/1000.0} sec")
        // Throughput = process count / time of elapsed
        println("Throughput: ${iterations/(totalTime/1000.0)} operations per sec")
        println("Latency (average): ${totalTime/iterations} msec")
    }
}
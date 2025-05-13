package wa.umiushi.kotlin_quest.benchmark

import kotlinx.benchmark.*
import org.openjdk.jmh.annotations.Fork
import java.util.*
import java.util.concurrent.TimeUnit

@State(Scope.Benchmark)
@Fork(1)
@Warmup(iterations = 10)
@Measurement(iterations = 20, time = 1, timeUnit = TimeUnit.MILLISECONDS)
open class MicroBenchmarking {
    private var data = emptyList<UUID>()

    @Setup
    fun setUp() {
        data = (1..100).map { UUID.randomUUID() }
    }

    @Benchmark
    fun combineUUIDBencmark(): UUID = data.reduce { the, other -> the + other }

    private operator fun UUID.plus(another: UUID): UUID {
        val mostSignificant = mostSignificantBits xor another.mostSignificantBits
        val leastSignificant = leastSignificantBits xor another.leastSignificantBits
        return UUID(mostSignificant, leastSignificant)
    }

}
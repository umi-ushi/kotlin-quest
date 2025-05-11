package wa.umiushi.kotlin_quest.collection

import java.util.*

interface CustomQueue<T> {
    fun enqueue(item: T)
    fun dequeue(): T?
    fun peek(): T?
    fun isEmpty(): Boolean
    fun size(): Int
}

class LinkedListQueue<T>() : CustomQueue<T> {
    private val items = LinkedList<T>()

    override fun enqueue(item: T) {
        items.add(item)
    }

    override fun dequeue(): T? = if(isEmpty()) null else items.removeFirst()

    override fun peek(): T? = items.firstOrNull()

    override fun isEmpty(): Boolean = items.isEmpty()

    override fun size(): Int = items.size
}
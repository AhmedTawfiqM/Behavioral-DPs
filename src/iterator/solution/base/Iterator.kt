package iterator.solution.base

interface Iterator<T> {
    fun hasNext() : Boolean
    fun current() : T
    fun next()
}
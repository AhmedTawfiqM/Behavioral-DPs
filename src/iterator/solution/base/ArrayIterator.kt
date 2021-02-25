package iterator.solution.base

import iterator.solution.BrowseHistory

class ArrayIterator(private val browseHistory: BrowseHistory) : Iterator<String> {

    private var position = 0

    override fun next() {
        position++
    }

    override fun current(): String {
        return browseHistory.getUrls()[position]
    }

    override fun hasNext(): Boolean {
        return position < browseHistory.getUrls().size
    }
}
package iterator.solution.base

import iterator.solution.BrowseHistory

class ListIterator(private val browseHistory: BrowseHistory) : Iterator<String> {

    private var position = 0

    override fun hasNext(): Boolean {
        return position < browseHistory.getUrls().size
    }

    override fun next() {
        position++
    }

    override fun current(): String {
        return browseHistory.getUrls()[position]
    }
}
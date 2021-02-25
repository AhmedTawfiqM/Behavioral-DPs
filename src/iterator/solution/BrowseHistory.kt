package iterator.solution

import iterator.solution.base.ArrayIterator

class BrowseHistory {

    //todo now u can change this class without the other dependencies affect
    // .. browseHistory is tightly coupled to ArrayIterator not to the 'urls' type > so no any problem
    private val urls = ArrayList<String>()
    //private val urls = Array<String>(5) { "it = $it" }

    fun createIterator() = ArrayIterator(this)

    fun push(url: String) {
        urls.add(url)
    }

    fun pop(): String {
        val lastItem = urls[urls.size - 1]
        urls.remove(lastItem)

        return lastItem
    }

    fun getUrls() = urls
}
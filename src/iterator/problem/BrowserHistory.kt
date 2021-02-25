package iterator.problem

class BrowserHistory {

    private val urls = ArrayList<String>()
    //todo Problem
    //if u change the Stock to another Type   //  Like This
    //private val urls = arrayOf(String())
    //todo then u have to change all Classes use this a Composition and too change this CLass

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
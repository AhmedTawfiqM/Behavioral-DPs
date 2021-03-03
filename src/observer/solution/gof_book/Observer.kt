package observer.solution.gof_book

interface Observer {
    fun onChanged(data: Data)
}
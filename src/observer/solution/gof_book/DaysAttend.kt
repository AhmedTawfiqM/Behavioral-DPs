package observer.solution.gof_book

class DaysAttend : Observer {
    override fun onChanged(data: Data) {
        println("DaysAttend $data")
    }
}
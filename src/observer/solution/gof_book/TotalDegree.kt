package observer.solution.gof_book

class TotalDegree : Observer {

    override fun onChanged(data: Data) {
        println("TotalDegree $data")
    }
}
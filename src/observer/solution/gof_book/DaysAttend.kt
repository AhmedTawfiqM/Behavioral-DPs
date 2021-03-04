package observer.solution.gof_book


//todo best practice inject data Source object here rather than Data parameter
class DaysAttend : IObserver<Data> {

    override fun onChanged(data: Data) {
        println("notified DaysAttend $data")
    }
}
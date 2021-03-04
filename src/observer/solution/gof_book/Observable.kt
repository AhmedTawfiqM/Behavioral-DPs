package observer.solution.gof_book


open class Observable : AbstractModel() {  //Subject in gof book

    private val observers = ArrayList<IObserver<Data>>()

    override fun attach(observer: IObserver<Data>) {
        observers.add(observer)
    }

    override fun detach(observer: IObserver<Data>) {
        observers.remove(observer)
    }

    override fun notifyObs(maionData: Data) {
        observers.forEach { it.onChanged(maionData) }
    }
}
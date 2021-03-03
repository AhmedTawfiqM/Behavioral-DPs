package observer.solution.gof_book


class Person : AbstractModel(){

    lateinit var mainData: Data
    private val observers = ArrayList<Observer>()

    fun setData(mainData: Data) {
        this.mainData = mainData
        notifyObs()
    }

    override fun attach(observer: Observer) {
        observers.add(observer)
    }

    override fun detach(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObs() {
        observers.forEach { it.onChanged(mainData) }
    }
}

data class Data(val id: String, val name: String, val address: String)
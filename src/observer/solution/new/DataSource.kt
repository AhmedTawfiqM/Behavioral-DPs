package observer.solution.new

class DataSource {

    private var value = ""
    private val observers = ArrayList<Observer>()

    fun setValue(value: String) {
        this.value = value
        notifyChanged()
    }

    private fun notifyChanged() {
        observers.forEach { it.onChanged(value) }
    }

    fun getValue() = value

    fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    fun removeObserver(observer: Observer) = observers.remove(observer)
}

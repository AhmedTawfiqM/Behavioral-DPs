package observer.solution.gof_book


abstract class AbstractModel {
    abstract fun attach(observer: Observer)
    abstract fun detach(observer: Observer)
    abstract fun notifyObs()
}
package observer.solution.gof_book

import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType


abstract class AbstractModel {
    abstract fun attach(observer: IObserver<Data>)
    abstract fun detach(observer: IObserver<Data>)
    abstract fun notifyObs(maionData: Data)
}
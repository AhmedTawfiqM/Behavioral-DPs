package observer.solution.gof_book

import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

interface Observer {
    fun onChanged(data: Data)
}

interface IObserver<T>{
    fun onChanged(data: T)
}

//more flexible Style  //todo dont pass a a specific type -> just inject datasource Object in Concrete Classes and just notify
interface IObserverSource{
    fun onChanged()
}
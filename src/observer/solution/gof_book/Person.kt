package observer.solution.gof_book

import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

class Person : Observable(){

    lateinit var mainData: Data

    fun setData(mainData: Data) {
        this.mainData = mainData
        notifyObs(mainData)
    }

}

data class Data(val id: String, val name: String, val address: String)
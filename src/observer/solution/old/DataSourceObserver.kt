package observer.solution.old

import observer.problwm.DataSource

class DataSourceObserver(private val dataSource: DataSource, private val observer: Observer) {

    fun setData(value: String) {
        dataSource.setValue(value)
        observer.onChanged(dataSource)
    }

}
package observer.solution.old

import observer.problwm.DataSource

interface Observer {
    fun onChanged(dataSource: DataSource)
}
package observer.problwm

class Chart() {

    fun communicate(dataSource: DataSource) {
        println("communicate ${dataSource.getValue()}")
    }
}
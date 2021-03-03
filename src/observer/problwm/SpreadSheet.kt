package observer.problwm

class SpreadSheet() {

    fun expose( dataSource: DataSource){
        println("expose ${dataSource.getValue()}")
    }
}
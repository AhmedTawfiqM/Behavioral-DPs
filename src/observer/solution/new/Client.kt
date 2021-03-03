package observer.solution.new

object Client {

    @JvmStatic
    fun main(args: Array<String>) {

        val chart = Chart()
        val spreadSheet = SpreadSheet()

//        val dataSource = DataSource(object : Observer {
//            override fun onChanged(value: String) {
//                chart.onChanged(value)
//                spreadSheet.onChanged(value)
//            }
//        })

        val dataSource = DataSource()
        dataSource.addObserver(chart)
        dataSource.addObserver(spreadSheet)

        dataSource.setValue("October Line")
        dataSource.setValue("Pyramids")

    }
}
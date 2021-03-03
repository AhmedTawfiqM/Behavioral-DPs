package observer.solution.new


class Chart : Observer {

    override fun onChanged(value: String) {
        println("Chart ${value}")
    }
}
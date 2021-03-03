package observer.solution.new


class SpreadSheet : Observer {

    override fun onChanged(value: String) {
        println("SpreadSheet $value")
    }
}
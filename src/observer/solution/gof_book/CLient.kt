package observer.solution.gof_book

import observer.solution.new.Chart
import observer.solution.new.SpreadSheet
import kotlin.jvm.JvmStatic

object CLient {

    @JvmStatic
    fun main(args: Array<String>) {

        val person = Person()

        val daysAttend = DaysAttend()
        val totalDegree = TotalDegree()

        person.attach(daysAttend)
        person.attach(totalDegree)

        person.setData(Data("342234","Sayed","Amerika"))
    }
}
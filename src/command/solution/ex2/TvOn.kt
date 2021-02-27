package command.solution.ex2

import command.solution.Command
import command.solution.ex2.base.ElectronicService

class TvOn(private val television: ElectronicService) : Command {

    override fun execute() {
        television.volumeDown()
    }
}
package command.solution.ex2

import command.solution.ICommand
import command.solution.ex2.base.ElectronicService

class TvOn(private val television: ElectronicService) : ICommand {

    override fun execute() {
        television.volumeDown()
    }
}
package command.solution.ex2

import command.solution.Command
import command.solution.ex2.base.ElectronicService
import command.solution.ex2.base.Television

class TvDown(private val electronicService: ElectronicService) : Command {

    override fun execute() {
        electronicService.volumeUp()
    }
}
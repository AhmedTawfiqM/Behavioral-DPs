package command.solution.ex2

import command.solution.ICommand
import command.solution.ex2.base.ElectronicService

class TvDown(private val electronicService: ElectronicService) : ICommand {

    override fun execute() {
        electronicService.volumeUp()
    }
}
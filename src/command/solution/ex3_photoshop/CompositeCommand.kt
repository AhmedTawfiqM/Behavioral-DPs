package command.solution.ex3_photoshop

import command.solution.ICommand

class CompositeCommand : ICommand {

    private val commands = ArrayList<ICommand>()
    fun addCommand(iCommand: ICommand) = commands.add(iCommand)

    override fun execute() {
        commands.forEach { it.execute() }
    }

}
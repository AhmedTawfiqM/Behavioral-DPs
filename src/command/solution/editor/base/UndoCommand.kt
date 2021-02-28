package command.solution.editor.base

import command.solution.editor.History

class UndoCommand(private val history: History) : ICommand {

    override fun execute() {
        if (history.size() > 0)
            history.pop().unExecute()
    }
}
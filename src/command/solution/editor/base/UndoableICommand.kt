package command.solution.editor.base

interface UndoableICommand : ICommand {
    fun unExecute()
}
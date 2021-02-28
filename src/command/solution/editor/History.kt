package command.solution.editor

import command.solution.editor.base.UndoableICommand

class History {
    private val commands = ArrayDeque<UndoableICommand>()

    fun pop() = commands.last()
    fun push(command: UndoableICommand) {
        commands.add(command)
    }

    fun size() = commands.size
}
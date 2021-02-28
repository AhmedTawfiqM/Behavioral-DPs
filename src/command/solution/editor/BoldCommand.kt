package command.solution.editor

import command.solution.editor.base.UndoableICommand

class BoldCommand(private val history: History, private val htmlDocument: HTMLDocument) : UndoableICommand {

    private var prevContent = ""

    override fun unExecute() {
        htmlDocument.setContent(prevContent)
    }

    override fun execute() {
        prevContent = htmlDocument.getContent()
        htmlDocument.makeBold()
        history.push(this)
    }
}
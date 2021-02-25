package state.solution.states

import state.solution.Tool

class SelectionTool : Tool {
    override fun moveUp() {
        println("SelectionTool moveUp")
    }

    override fun moveDown() {
        println("SelectionTool moveDown")
    }
}
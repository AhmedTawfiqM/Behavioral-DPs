package state.solution.states

import state.solution.Tool

class BrushTool : Tool {
    override fun moveUp() {
        println("BrushTool moveUp")
    }

    override fun moveDown() {
        println("BrushTool moveDown")
    }
}
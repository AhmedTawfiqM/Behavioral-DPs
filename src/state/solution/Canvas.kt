package state.solution

class Canvas {
    lateinit var tool: Tool

    fun setCurrentTool(tool: Tool) {
        this.tool = tool
    }

    fun getCurrentTool() = tool

    fun moveUp() = tool.moveUp()
    fun moveDown() = tool.moveDown()
}
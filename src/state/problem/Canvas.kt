package state.problem

class Canvas {

    private lateinit var currentTool: ToolType

    fun moveDown() {
        when(currentTool){
            ToolType.SELECTION ->  println("Selection Icon")
            ToolType.BRUSH ->  println("Brush Icon")
            ToolType.ERASER ->  println("Eraser Icon")
            else -> throw ExceptionInInitializerError("Not Fount Type Tool")
        }
    }

    fun moveUp() {
        when(currentTool){
            ToolType.SELECTION ->  println("Draw Dashed Rectangle")
            ToolType.BRUSH ->  println("Draw a Line")
            ToolType.ERASER ->  println("Erase SomeThing")
            else -> throw ExceptionInInitializerError("Not Fount Type Tool")
        }
    }
    //problem
    //in real Scenria World ..we has hundred of Types like Keyboard Keys
    // - So difficult for  Maintainable , Extensible
    // - Violate Solid and OOP
}
package solution

class History {  //Caretaker
    private val states = ArrayList<EditorState>()
    private var currentStatePos = -1

    fun push(state: EditorState) {
        states.add(state)
        currentStatePos++
    }

    fun pop(): EditorState {  //undo
        val lastPos = states.size - 1
        val lastItem = states[lastPos]
        states.remove(lastItem)

        return lastItem
    }

    fun undo(): EditorState {
        currentStatePos--
        return state()
    }

    fun redo(): EditorState {
        currentStatePos++
        return state()
    }

    private fun state() = states[currentStatePos]  //todo need Validation on States of List

}
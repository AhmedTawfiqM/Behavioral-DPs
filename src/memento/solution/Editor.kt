package solution

class Editor {  //Originator
    private var content = ""

    fun setContent(content: String) {
        this.content = content
    }
    fun getContent() = content

    fun createState(): EditorState {
        return EditorState(content)
    }

    fun restore(state: EditorState) {
        content = state.getContent()
    }
}
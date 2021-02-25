package solution

data class EditorState(private val content: String) {  //Memento

    fun getContent() = content
}
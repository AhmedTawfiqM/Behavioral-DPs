package command.solution.editor

class HTMLDocument {

    private var content = ""

    fun makeBold() {
        content = "<b> $content </b>"
    }

    fun setContent(content: String) {
        this.content = content
    }

    fun getContent() = content
}
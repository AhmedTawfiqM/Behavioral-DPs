package mediator.solution

class ArticlesDialogBox : DialogBox() {

    var btnSave = Button(this)
    var listBox = ListBox(this)
    var textBox = TextBox(this)

    fun simulateUserInteraction() {
        listBox.setSelected("Article 1")
        textBox.setValue("")
        listBox.setSelected("Article 2")
        println("btnSave: ${btnSave.isEnabled()} , textbox: ${textBox.getValue()}")
    }

    override fun changed(uiControl: UiControl) {
        if (uiControl == listBox)
            articlesSelection()
        else if (uiControl == textBox)
            textBoxChanged()
    }

    private fun textBoxChanged() {
        val isEmpty = textBox.getValue().isNullOrEmpty()
        btnSave.setIsEnabled(!isEmpty)
    }

    private fun articlesSelection() {
        textBox.setValue(listBox.getSelection())
        btnSave.setIsEnabled(true)
    }
}
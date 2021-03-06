package mediator.solution

class TextBox(owner: DialogBox) : UiControl(owner) {

    private var value: String = ""

    fun getValue() = value
    fun setValue(value: String) {
        this.value = value
        owner.changed(this)
    }
}
package mediator.problem

class TextBox : UiControl() {

    private var value: String = ""

    fun getValue() = value
    fun setValue(value: String) {
        this.value = value
    }
}
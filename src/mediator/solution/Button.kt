package mediator.solution

class Button(owner: DialogBox) : UiControl(owner) {

    private var isEnabled: Boolean = true

    fun isEnabled() = isEnabled

    fun setIsEnabled(isEnabled: Boolean) {
        this.isEnabled = isEnabled
        //owner.changed(this)
    }
}
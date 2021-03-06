package mediator.problem

import jdk.jfr.Enabled

class Button : UiControl() {

    private var isEnabled: Boolean = true

    fun isEnabled() = isEnabled
    fun setIsEnabled(isEnabled: Boolean) {
        this.isEnabled = isEnabled
    }
}
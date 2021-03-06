package mediator.solution

class ListBox(owner: DialogBox) : UiControl(owner) {

    private var selection: String = ""
    fun getSelection() = selection

    fun setSelected(selection: String){
        this.selection=selection
        owner.changed(this)
    }
}
package mediator.problem

//todo not reusable //need for every one component
class ListBox : UiControl() {
    private var selection: String = ""
        get() {
            if (field.isNullOrBlank()) field = ""
            return field
        }
        set(value) {
            field = value
        }
}
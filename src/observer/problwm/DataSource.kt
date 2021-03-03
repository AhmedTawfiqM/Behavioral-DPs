package observer.problwm

class DataSource {
    private var value: String = "Default"

    fun setValue(value: String) {
        this.value = value
    }

    fun getValue() = value
}
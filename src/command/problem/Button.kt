package command.problem

class Button {

    //todo -> So now the click method depends on Type and evertime u must change this class
    //if another logic added, u has to add more implementations and complexity
    //violate OCP , not flexible to increase

    fun click(type: String) {
        when (type) {
            "Add Customer" -> println("Add Customer")
            "delete Customer" -> println("delete Customer")
            "Update Customer" -> println("Update Customer")
        }

    }
}
package templatemethod.problem

class ItalianCreep {

    private val creep = Creep()

    fun makeSandwich() {
        creep.makeSandwich(
            isAddMeat = true, isAddCheese = true, isAddVegetables = false, isAddCondiments = true,
            "Italian"
        )
    }
}
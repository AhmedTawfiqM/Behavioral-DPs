package templatemethod.problem

class BrazalianCreep {

    private val creep = Creep()

    fun makeSandwich() {
        creep.makeSandwich(
            isAddMeat = false, isAddCheese = false, isAddVegetables = false, isAddCondiments = true,
            "Brazlian"
        )
    }
}
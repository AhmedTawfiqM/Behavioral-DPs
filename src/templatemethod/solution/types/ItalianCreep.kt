package templatemethod.solution.types

class ItalianCreep : Creep() {

    override fun wrapTheSandwich() {
        println("wrapTheSandwich")
    }

    override fun addCondiments() {
        println("addCondiments")
    }

    override fun addVegetables() {
        println("addVegetables")
    }

    override fun addCheese() {
        println("addCheese")
    }

    override fun addMeat() {
        println("addMeat")
    }

    override fun cutBun() {
        println("cutBun")
    }

    override fun isAddCondiments(): Boolean {
        return true
    }

    override fun isAddVegetables(): Boolean {
        return true
    }

    override fun isAddCheese(): Boolean {
        return true
    }

    override fun isAddMeat(): Boolean {
        return true
    }

}
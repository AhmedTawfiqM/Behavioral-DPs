package templatemethod.solution.types

abstract class Creep {

    fun makeSandwich() {

        cutBun()

        if (isAddMeat())
            addMeat()
        if (isAddCheese())
            addCheese()
        if (isAddVegetables())
            addVegetables()
        if (isAddCondiments())
            addCondiments()

        wrapTheSandwich()
    }

    abstract fun isAddCondiments(): Boolean
    abstract fun isAddVegetables(): Boolean
    abstract fun isAddCheese(): Boolean
    abstract fun isAddMeat(): Boolean

    abstract fun wrapTheSandwich()
    abstract fun addCondiments()
    abstract fun addVegetables()
    abstract fun addCheese()
    abstract fun addMeat()
    abstract fun cutBun()
}
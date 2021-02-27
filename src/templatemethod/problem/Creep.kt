package templatemethod.problem

class Creep {

    var type = ""

    //hooks
    fun makeSandwich(isAddMeat: Boolean, isAddCheese: Boolean, isAddVegetables: Boolean, isAddCondiments: Boolean,type: String) {

        cutBun()
        if (isAddMeat)
            addMeat()
        if (isAddCheese)
            addCheese()
        if (isAddVegetables)
            addVegetables()
        if (isAddCondiments)
            addCondiments()

        if(type=="Brazlian")
            customBrazlian()
        else if(type=="Italian")
            customItalian()

        wrapTheSandwich()
    }

    private fun customItalian() {
        println("customItalian")
    }

    private fun customBrazlian() {
        println("customBrazlian")
    }

    private fun wrapTheSandwich() {
        println("wrapTheSandwich")
    }

    private fun addCondiments() {
        println("addCondiments")
    }

    private fun addVegetables() {
        println("addVegetables")
    }

    private fun addCheese() {
        println("addCheese")
    }

    private fun addMeat() {
        println("addMeat")
    }

    private fun cutBun() {
        println("cutBun")
    }
}
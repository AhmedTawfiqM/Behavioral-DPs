package templatemethod.solution

import templatemethod.solution.types.BrazilianCreep
import templatemethod.solution.types.Creep
import templatemethod.solution.types.ItalianCreep

class SandWishMaker {
    //todo 'Factory' 'SandWishMaker' (type)

    private lateinit var creep: Creep

    fun makeSandwich() {
        println(".......ItalianCreep............................")
        val customer1 = ItalianCreep()
        customer1.makeSandwich()

        println(".......BrazilianCreep..........................")
        val customer2 = BrazilianCreep()
        customer2.makeSandwich()
    }

}
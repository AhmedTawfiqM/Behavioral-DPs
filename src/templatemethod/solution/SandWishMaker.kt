package templatemethod.solution

import templatemethod.solution.types.BrazilianCreep
import templatemethod.solution.types.Creep
import templatemethod.solution.types.ItalianCreep

class SandWishMaker {
    //todo 'Factory' 'SandWishMaker' based on (type)
    private lateinit var creep: Creep

    //todo 'Solved' same (Template and Invocation  and skeleton) but different Implementation
    fun makeSandwich() {
        println(".......ItalianCreep............................")
        val customer1 = ItalianCreep()
        customer1.makeSandwich()

        println(".......BrazilianCreep..........................")
        val customer2 = BrazilianCreep()
        customer2.makeSandwich()
    }
    //Template method design pattern is to define an algorithm as a skeleton of operations
    // and leave the details to be implemented by the child classes.
    // The overall structure and sequence of the algorithm is preserved by the parent class
    //...........................................
    //https://www.youtube.com/watch?v=aR1B8MlwbRI
    //https://refactoring.guru/design-patterns/template-method
    //https://www.geeksforgeeks.org/template-method-design-pattern/
    //https://www.tutorialspoint.com/design_pattern/template_pattern.htm

}
package strategy.solution.filters

import strategy.solution.Filter

class ContractFilter : Filter {

    override fun apply(fileName: String) {
        println("Filter $fileName with ContractFilter")
    }
}
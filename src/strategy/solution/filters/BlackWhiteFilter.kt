package strategy.solution.filters

import strategy.solution.Filter

class BlackWhiteFilter : Filter {

    override fun apply(fileName: String) {
        println("Filter $fileName with BlackWhiteFilter")
    }
}
package command.solution.ex1

import command.solution.Command

class AddCustomer(private val customerService: CustomerService) : Command {

    override fun execute() {
        customerService.addCustomer()
    }
}
package command.solution.ex1

import command.solution.ICommand

class AddCustomer(private val customerService: CustomerService) : ICommand {

    override fun execute() {
        customerService.addCustomer()
    }
}
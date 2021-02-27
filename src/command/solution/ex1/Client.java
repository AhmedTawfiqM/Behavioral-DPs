package command.solution.ex1;

import command.solution.Button;
import command.solution.Command;

public class Client {

    public static void main(String[] args) {

        CustomerService customerService = new CustomerService();
        Command addCustomerCommand = new AddCustomer(customerService);
        Button button = new Button(addCustomerCommand);
        button.click();
    }
}

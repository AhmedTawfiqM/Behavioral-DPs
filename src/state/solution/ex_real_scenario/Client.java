package state.solution.ex_real_scenario;

import state.solution.ex_real_scenario.base.OrderedState;

public class Client {

    public static void main(String[] args) {

        Mail mail = new Mail();
        mail.setState(new OrderedState());

        mail.print();

        mail.next();
        mail.print();

        mail.next();
        mail.print();

        mail.prev();
        mail.print();
    }

    //https://www.baeldung.com/java-state-design-pattern
    //https://refactoring.guru/design-patterns/state
}

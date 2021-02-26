package templatemethod.problem;

public class Client {

    //Two different components have significant similarities, but demonstrate no reuse of common interface or implementation.
    // If a change common to both components becomes necessary, duplicate effort must be expended.

    public static void main(String[] args) {

        ItalianCreep italianCreep = new ItalianCreep();
        italianCreep.makeSandwich();

        BrazalianCreep brazalianCreep = new BrazalianCreep();
        brazalianCreep.makeSandwich();
    }
}

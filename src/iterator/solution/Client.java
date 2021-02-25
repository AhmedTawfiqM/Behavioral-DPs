package iterator.solution;

import iterator.solution.base.Iterator;

public class Client {

    public static void main(String[] args) {

        BrowseHistory browseHistory = new BrowseHistory();
        browseHistory.push("a");
        browseHistory.push("b");
        browseHistory.push("c");
        browseHistory.push("d");

        browseHistory.pop();

        //todo Client is tightly coupled to iterater (abstraction) not details
        Iterator<String> iterator = browseHistory.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}

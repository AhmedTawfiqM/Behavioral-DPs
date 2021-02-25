package iterator.problem;

public class Client {

    public static void main(String[] args) {

        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.push("a");
        browserHistory.push("b");
        browserHistory.push("c");
        browserHistory.push("d");

        browserHistory.pop();

        for(int i=0;i<browserHistory.getUrls().size();i++){
            System.out.println(browserHistory.getUrls().get(i));
        }

    }
}

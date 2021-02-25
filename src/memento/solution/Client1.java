package memento.solution;

import solution.Editor;
import solution.History;

public class Client1 {

    //Originator   Editor
    //Memento      EditorState
    //CareTaker    History
    public static void main(String[] args) {

        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");

        editor.restore(history.pop());  //undo
        editor.restore(history.pop());  //undo

        System.out.println(editor.getContent());

    }

    //todo
    //examples:
    //https://www.tutorialspoint.com/design_pattern/memento_pattern.htm
    //solution
    //https://refactoring.guru/design-patterns/memento
}

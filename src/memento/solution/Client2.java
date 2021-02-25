package memento.solution;

import solution.Editor;
import solution.History;

public class Client2 {

    //Originator   Editor
    //Memento      EditorState
    //CareTaker    History
    public static void main(String[] args) {
        Editor editor =new  Editor();
        History history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        history.push(editor.createState());

        editor.restore(history.undo());
        System.out.println(editor.getContent());

        editor.restore(history.redo());
        System.out.println(editor.getContent());

    }
}

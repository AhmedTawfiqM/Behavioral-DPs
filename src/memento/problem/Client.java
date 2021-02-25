package memento.problem;

import problem.Editor;

public class Client {

    public static void main(String[] args) {
        Editor editor = new Editor();  //Goal (Undo Mechanism Feature)
        editor.setContent("a");
        editor.setContent("b");
        editor.setContent("c");

        System.out.println(editor.getContent());

        editor.undo();
        System.out.println(editor.getContent());

        editor.undo();
        System.out.println(editor.getContent());

        editor.undo();

    }
}

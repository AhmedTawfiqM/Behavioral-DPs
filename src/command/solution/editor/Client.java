package command.solution.editor;

import command.solution.editor.base.UndoCommand;

public class Client {

    public static void main(String[] args) {

        HTMLDocument document = new HTMLDocument();
        document.setContent("Test Bold");

        History history = new History();

        BoldCommand boldCommand = new BoldCommand(history, document);
        boldCommand.execute();
        System.out.println(document.getContent());

        //todo u can use 'unExecute' Directly but for Maintainable Code seperate Undo Mechanism Command
        //boldCommand.unExecute();
       // System.out.println(document.getContent());

        //todo seperate like this
        UndoCommand undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}

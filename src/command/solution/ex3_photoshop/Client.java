package command.solution.ex3_photoshop;

public class Client {

    public static void main(String[] args) {

        CompositeCommand compositeCommand = new CompositeCommand();

        compositeCommand.addCommand(new ResizeImageCommand());
        compositeCommand.addCommand(new BlackWhiteImage());
        compositeCommand.addCommand(new RedEyesCommand());

        compositeCommand.execute();
    }
}

package command.solution.ex2;

import command.solution.Button;
import command.solution.ex2.base.ElectronicService;

public class Client {

    public static void main(String[] args) {

        ElectronicService tv = TvRemote.Companion.getDevice();

        TvOn tvOn = new TvOn(tv);
        TvDown tvDown = new TvDown(tv);
        Button button = new Button(tvOn);

        button.click();

        button = new Button(tvDown);
        button.click();
    }
}

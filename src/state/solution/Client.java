package state.solution;

import state.solution.states.BrushTool;
import state.solution.states.SelectionTool;

public class Client {

    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new BrushTool());

        canvas.moveUp();
        canvas.moveDown();
    }


    //problem   -> The State pattern is closely related to the concept of a Finite-State Machine. (if - Switch) Complexity

    //https://refactoring.guru/design-patterns/state
}

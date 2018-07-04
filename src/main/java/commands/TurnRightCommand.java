package commands;

import rovers.MarsRover;

public class TurnRightCommand implements Command {

    MarsRover rover;

    public TurnRightCommand(MarsRover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.turnRight();
    }
}

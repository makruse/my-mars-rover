package commands;

import rovers.MarsRover;

public class TurnLeftCommand implements Command {

    MarsRover rover;

    public TurnLeftCommand(MarsRover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.turnLeft();
    }
}

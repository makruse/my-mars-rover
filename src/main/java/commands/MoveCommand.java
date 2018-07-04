package commands;

import rovers.MarsRover;

public class MoveCommand implements Command {

    MarsRover rover;

    public MoveCommand(MarsRover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.moveForward();
    }
}


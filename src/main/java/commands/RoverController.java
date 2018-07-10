package commands;

import coordinates.Coordinates;
import directions.Direction;
import plateaus.MarsPlateau;
import rovers.MarsRover;

import java.util.LinkedList;
import java.util.List;

public class RoverController {

    public MarsPlateau initPlateau(int upperX, int upperY) {
        return MarsPlateau.getPlateau(upperX, upperY);
    }

    public Coordinates initCoordinates(int x, int y) {
        return new Coordinates(x, y);
    }

    public MarsRover initRover(Coordinates initCoordinates, Direction initDirection, MarsPlateau plateau) {
        return new MarsRover(initCoordinates, initDirection, plateau);
    }

    public List<Command> setCommandSequence(String commandString, MarsRover rover) {
        List<Command> commandSequence = new LinkedList<>();
        commandString.chars().forEach(c -> {
            switch (c) {
                case ('R'):
                    commandSequence.add(new TurnRightCommand(rover));
                    break;
                case ('L'):
                    commandSequence.add(new TurnLeftCommand(rover));
                    break;
                case ('M'):
                    commandSequence.add(new MoveCommand(rover));
                    break;
                default:
                    throw new IllegalArgumentException(
                            "Illegal Argument when setting command sequence for rover");
            }
        });
        return commandSequence;
    }

    public void runCommands(List<Command> commandSequence) {
        commandSequence.forEach(Command::execute);
    }

}





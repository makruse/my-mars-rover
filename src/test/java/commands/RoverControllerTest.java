package commands;

import coordinates.Coordinates;
import directions.Direction;
import org.junit.Before;
import org.junit.Test;
import rovers.MarsRover;

import static org.junit.Assert.*;

public class RoverControllerTest {

    private Direction direction;
    private Coordinates coordinates;
    private MarsRover rover;
    private Command command;
    private RoverController controller;

    @Before
    public void setUp() {
        direction = Direction.NORTH;
        coordinates = new Coordinates(1, 2);
        rover = new MarsRover(coordinates, direction);
        controller = new RoverController();
    }

    @Test
    public void roverShouldChangeDirectionToTheRight_whenControllerRunsTurnRightCommand() {
        command = new TurnRightCommand(rover);
        controller.setCommands(command);
        controller.runCommands();

        assertEquals(Direction.EAST, rover.getDirection());
    }

    @Test
    public void roverShouldChangeDirectionToTheLeft_whenControllerRunsTurnLeftCommand() {
        command = new TurnLeftCommand(rover);
        controller.setCommands(command);
        controller.runCommands();

        assertEquals(Direction.WEST, rover.getDirection());
    }

    @Test
    public void roverShouldMoveOneStepForward_whenControllerRunsMoveCommand() {
        command = new MoveCommand(rover);
        controller.setCommands(command);
        controller.runCommands();

        assertEquals(3, rover.getCoordinates().getY());
    }
}
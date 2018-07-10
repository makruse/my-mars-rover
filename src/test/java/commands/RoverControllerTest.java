package commands;

import coordinates.Coordinates;
import directions.Direction;
import org.junit.Before;
import org.junit.Test;
import plateaus.MarsPlateau;
import rovers.MarsRover;

import java.util.List;

import static org.junit.Assert.*;

public class RoverControllerTest {

    private MarsRover rover;
    private RoverController controller;

    @Before
    public void setUp() {
        rover = new MarsRover(new Coordinates(1, 2), Direction.NORTH, MarsPlateau.getPlateau(5,5));
        controller = new RoverController();
    }

    @Test
    public void roverShouldChangeDirectionToTheRight_whenControllerReceivesRAsCommandString() {
        String commandString = "R";
        List<Command> commandSequence = controller.setCommandSequence(commandString ,rover);
        controller.runCommands(commandSequence);

        assertEquals(Direction.EAST, rover.getDirection());
    }

    @Test
    public void roverShouldChangeDirectionToTheLeft_whenControllerReceivesLAsCommandString() {
        String commandString = "L";
        List<Command> commandSequence = controller.setCommandSequence(commandString ,rover);
        controller.runCommands(commandSequence);

        assertEquals(Direction.WEST, rover.getDirection());
    }

    @Test
    public void overShouldMoveOneStepForward_whenControllerReceivesMAsCommandString() {
        String commandString = "M";
        List<Command> commandSequence = controller.setCommandSequence(commandString ,rover);
        controller.runCommands(commandSequence);

        assertEquals(3, rover.getCoordinates().getY());
    }
}
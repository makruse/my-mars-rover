package commands;

import coordinates.Coordinates;
import directions.Direction;
import org.junit.Test;
import plateaus.MarsPlateau;
import rovers.MarsRover;

import static org.junit.Assert.*;

public class TurnRightCommandTest {

    @Test
    public void roverShouldChangeDirectionToTheRight_WhenCommandIsExecuted(){
        MarsRover rover = new MarsRover(new Coordinates(1, 2), Direction.NORTH, MarsPlateau.getPlateau(5,5));
        Command turnRight = new TurnRightCommand(rover);
        turnRight.execute();
        assertEquals(Direction.EAST, rover.getDirection());
    }
}
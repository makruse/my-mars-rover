package commands;

import coordinates.Coordinates;
import directions.Direction;
import org.junit.Test;
import plateaus.MarsPlateau;
import rovers.MarsRover;

import static org.junit.Assert.*;

public class TurnLeftCommandTest {

    @Test
    public void roverShouldChangeDirectionToTheLeft_WhenCommandIsExecuted(){
        MarsRover rover = new MarsRover(new Coordinates(1, 2), Direction.NORTH, MarsPlateau.getPlateau(5,5));
        Command turnLeft = new TurnLeftCommand(rover);
        turnLeft.execute();
        assertEquals(Direction.WEST, rover.getDirection());
    }
}
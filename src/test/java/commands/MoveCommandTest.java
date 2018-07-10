package commands;

import coordinates.Coordinates;
import directions.Direction;
import org.junit.Test;
import plateaus.MarsPlateau;
import rovers.MarsRover;

import static org.junit.Assert.*;

public class MoveCommandTest {

    @Test
    public void roverShouldMoveOneStepForward_WhenCommandIsExecuted(){
        MarsRover rover = new MarsRover(new Coordinates(1, 2), Direction.NORTH, MarsPlateau.getPlateau(5,5));
        Command move = new MoveCommand(rover);
        move.execute();
        assertEquals(3, rover.getCoordinates().getY());
    }
}
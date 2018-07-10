package rovers;

import coordinates.Coordinates;
import directions.Direction;
import org.junit.Before;
import org.junit.Test;
import plateaus.MarsPlateau;

import static org.junit.Assert.*;

public class MarsRoverTest {

    private MarsRover rover;

    @Before
    public void setUp() {
        rover = new MarsRover(new Coordinates(1,2), Direction.NORTH, MarsPlateau.getPlateau(5,5));
    }

    @Test
    public void shouldChangeDirectionClockwise_WhenRoverTurnsToRightSide() {
        rover.turnRight();
        assertEquals(Direction.EAST, rover.getDirection());
        rover.turnRight();
        assertEquals(Direction.SOUTH, rover.getDirection());
        rover.turnRight();
        assertEquals(Direction.WEST, rover.getDirection());
        rover.turnRight();
        assertEquals(Direction.NORTH, rover.getDirection());
    }

    @Test
    public void shouldChangeDirectionAnticlockwise_WhenRoverTurnsToLeftSide() {
        rover.turnLeft();
        assertEquals(Direction.WEST, rover.getDirection());
        rover.turnLeft();
        assertEquals(Direction.SOUTH, rover.getDirection());
        rover.turnLeft();
        assertEquals(Direction.EAST, rover.getDirection());
        rover.turnLeft();
        assertEquals(Direction.NORTH, rover.getDirection());
    }

    @Test
    public void shouldIncreaseXCoordinateByOneStep_WhenDirectionOfRoverIsNorth() {
        rover.moveForward();
        assertEquals(1, rover.getCoordinates().getX());
        assertEquals(3, rover.getCoordinates().getY());
    }
}
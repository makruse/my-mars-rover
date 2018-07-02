package rovers;

import coordinates.Coordinates;
import directions.Direction;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MarsRoverTest {

    private Direction direction;
    private Coordinates coordinates;
    private MarsRover rover;

    @Before
    public void setUp() throws Exception {
        coordinates = new Coordinates(1,2);
        direction = Direction.NORTH;
    }

    @Test
    public void shouldChangeDirectionToTheRight_WhenRoverTurnsToRightSide() {
        rover = new MarsRover(coordinates, direction);
        rover.turnRight();
        assertEquals(Direction.EAST, rover.getDirection());
    }

    @Test
    public void shouldChangeDirectionToTheLeft_WhenRoverTurnsToLeftSide() {
        rover = new MarsRover(coordinates, direction);
        rover.turnLeft();
        assertEquals(Direction.WEST, rover.getDirection());
    }

    @Test
    public void shouldIncreaseXCoordinateByOneStep_WhenRoverMovesOneStepForward() {
        rover = new MarsRover(coordinates, direction);
        rover.moveForward();
        assertEquals(1, rover.getCoordinates().getX());
        assertEquals(3, rover.getCoordinates().getY());
    }
}
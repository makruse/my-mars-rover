package coordinates;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoordinatesTest {

    private Coordinates coordinates;

    @Before
    public void setUp() {
        coordinates = new Coordinates(3,4);
    }

    @Test
    public void shouldIncreaseOnlyXCoordinateByOne() {
        coordinates.increaseXByOne();
        assertEquals(4, coordinates.getX());
        assertEquals(4, coordinates.getY());
    }

    @Test
    public void shouldIncreaseOnlyYCoordinateByOne() {
        coordinates.increaseYByOne();
        assertEquals(3, coordinates.getX());
        assertEquals(5, coordinates.getY());
    }

    @Test
    public void shouldDecreaseOnlyXCoordinateByOne() {
        coordinates.decreaseXByOne();
        assertEquals(2, coordinates.getX());
        assertEquals(4, coordinates.getY());
    }

    @Test
    public void shouldDecreaseOnlyYCoordinateByOne() {
        coordinates.decreaseYByOne();
        assertEquals(3, coordinates.getX());
        assertEquals(3, coordinates.getY());
    }
}
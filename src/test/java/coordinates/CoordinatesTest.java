package coordinates;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoordinatesTest {

    private Coordinates coordinates;

    @Before
    public void setUp() throws Exception {
        coordinates = new Coordinates(3,4);
    }

    @Test
    public void increaseXByOne() {
        coordinates.increaseXByOne();
        assertEquals(4, coordinates.getX());
        assertEquals(4, coordinates.getY());
    }

    @Test
    public void increaseYByOne() {
        coordinates.increaseYByOne();
        assertEquals(3, coordinates.getX());
        assertEquals(5, coordinates.getY());
    }

    @Test
    public void decreaseXByOne() {
        coordinates.decreaseXByOne();
        assertEquals(2, coordinates.getX());
        assertEquals(4, coordinates.getY());
    }

    @Test
    public void decreaseYByOne() {
        coordinates.decreaseYByOne();
        assertEquals(3, coordinates.getX());
        assertEquals(3, coordinates.getY());
    }
}
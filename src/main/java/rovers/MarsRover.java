package rovers;

import coordinates.Coordinates;
import directions.Direction;

public class MarsRover {

    private Coordinates coordinates;
    private Direction direction;

    public MarsRover(Coordinates coordinates, Direction direction) {
        this.coordinates = coordinates;
        this.direction = direction;
    }

    public String printCurrentLocation() {
        return coordinates.getX() + " " + coordinates.getY() + " " + direction.toString();
    }

    public void turnRight(){


    }
}



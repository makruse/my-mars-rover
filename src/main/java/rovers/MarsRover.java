package rovers;

import coordinates.Coordinates;
import directions.Direction;
import plateaus.MarsPlateau;

public class MarsRover {

    private Coordinates coordinates;
    private Direction direction;
    private MarsPlateau plateau;

    public MarsRover(Coordinates coordinates, Direction direction, MarsPlateau plateau) {
        this.coordinates = coordinates;
        this.direction = direction;
        this.plateau = plateau;
    }

    public void turnRight() {
        switch (direction) {
            case NORTH:
                direction = Direction.EAST;
                break;
            case WEST:
                direction = Direction.NORTH;
                break;
            case SOUTH:
                direction = Direction.WEST;
                break;
            case EAST:
                direction = Direction.SOUTH;
        }
    }

    public void turnLeft() {
        switch (direction) {
            case NORTH:
                direction = Direction.WEST;
                break;
            case WEST:
                direction = Direction.SOUTH;
                break;
            case SOUTH:
                direction = Direction.EAST;
                break;
            case EAST:
                direction = Direction.NORTH;
        }
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public Direction getDirection() {
        return direction;
    }

    public void moveForward() {
        switch (direction) {
            case NORTH:
                coordinates.increaseYByOne();
                break;
            case WEST:
                coordinates.decreaseXByOne();
                break;
            case SOUTH:
                coordinates.decreaseYByOne();
                break;
            case EAST:
                coordinates.increaseXByOne();
        }
    }

    public String printCurrentLocation() {
        return coordinates.getX() + " " + coordinates.getY() + " " + direction.toString();
    }
}



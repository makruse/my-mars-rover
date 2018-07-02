import commands.CommandParser;
import coordinates.Coordinates;
import directions.Direction;
import rovers.MarsRover;

public class Main {

    public static void main(String[] args) {

        CommandParser parser = new CommandParser();
        parser.readInput("input.txt");

        Direction direction = Direction.NORTH;
        Coordinates coordinates = new Coordinates(1,2);
        MarsRover firstRover = new MarsRover(coordinates, direction);
        firstRover.turnRight();
        firstRover.moveForward();

        System.out.println(firstRover.printCurrentLocation());

        firstRover.turnLeft();

        System.out.println(firstRover.printCurrentLocation());
    }
}

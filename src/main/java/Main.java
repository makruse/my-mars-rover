import commands.*;
import coordinates.Coordinates;
import directions.Direction;
import plateaus.MarsPlateau;
import rovers.MarsRover;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //CommandParser parser = new CommandParser();
        //parser.readInput("input.txt");

        //expected output from parser for plateau initialization
        int [] plateauDimensions = new int[] {5, 5};
        int upperXPlateau = plateauDimensions[0];
        int upperYPlateau = plateauDimensions[1];

        //expected output from parser for Rover initialization? where to all the parsing, eg from char to enum?
        int xRover = 1;
        int yRover = 2;
        Direction initialDirection = Direction.NORTH;

        //expected output from parser for plateau initialization
        String commandString = "LMLMLMLMM";

        RoverController controller = new RoverController();

        MarsPlateau plateau = controller.initPlateau(upperXPlateau, upperYPlateau);
        Coordinates initialCoordinates = controller.initCoordinates(xRover, yRover);
        MarsRover rover = controller.initRover(initialCoordinates, initialDirection, plateau);
        List<Command> commandSequence = controller.setCommandSequence(commandString, rover);
        controller.runCommands(commandSequence);

        System.out.println(rover.printCurrentLocation());
    }
}

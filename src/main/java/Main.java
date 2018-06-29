import commands.CommandParser;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        CommandParser parser = new CommandParser();
        try {
            parser.readInput("input.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

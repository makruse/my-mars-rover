package commands;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class CommandParser {

    public void readInput(String fileName) throws IOException {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(fileName);
        Scanner s = new Scanner(is).useDelimiter("\\A");
        String input = s.hasNext() ? s.next() : "";
        System.out.println(input);
    }
}

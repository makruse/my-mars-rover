package commands;

import java.io.InputStream;
import java.util.Scanner;

public class CommandParser {

    public void readInput(String fileName)  {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(fileName);
        Scanner scanner = new Scanner(is).useDelimiter("\\A");
        String input = scanner.hasNext() ? scanner.next() : "";
        scanner.close();
        System.out.println(input);
    }
}

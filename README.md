# Mars Rover Project

## Overview
  This is a small java application to simulate rovers exploring a 2-dimensional grid: 
  A squad of robotic rovers are to be landed by NASA on a plateau on Mars. This plateau, which is curiously rectangular, must be navigated by the rovers so that their on-board 
  cameras can get a complete view of the surrounding terrain to send back to Earth. A rover’s position and location is represented by 
  a combination of x and y co-ordinates and a letter representing one of the four cardinal compass points. 
  The plateau is divided up into a grid to simplify navigation. An example position might be 0, 0, N, which means the rover is in the 
  bottom left corner and facing North.
  In order to control a rover, NASA sends a simple string of letters. The possible letters are ‘L’, ‘R’ and ‘M’. ‘L’ and ‘R’ makes the 
  rover spin 90 degrees left or right respectively, without moving from its current spot. ‘M’ means move forward one grid point, and 
  maintain the same heading. It is assumed that the square directly North from (x, y) is (x, y+1).

## Prerequisites
  You need the following installed and available in your $PATH:
  • JDK Version 1.8 or greater (https://www.java.com/de/download/)
  • JUNIT 4 or greater 
  
## Run application
  Application entry point (main class): src/main/java/Main
  • Using commandline tools: use the following command from the application root directory:
    ```
    java -cp bin de/nodomain/mars/program/MarsProgram
    ```
  • Using IDE IntellJ: navigate to scr/main/java/main and use 'run as java application' command.

## Testing

### Test input
   • First line of input: upper-right coordinates of plateau with lower-left coordinates being (0,0)
   • The rest of input: information pertaining to the rovers deployed with each having two lines of input: 
        1. line: the rover’s position (two integers and a letter separated by spaces = x- and y-coordinates and the rover’s orientation)
        2. line: series of instructions telling the rover how to move.
   • Rover run sequentially 
   • Assumption: rovers cannot collide or block each others way.

### Example test input
```
    5 5
    2
    1 2 N
    LMLMLMLMM
    3 3 E
    MMRMMRMRRM
```

### Expected test output
The output for each rover is its final co-ordinates and heading. 
```
1 3 N
5 1 E
```

### Running the tests
  The source code for testing the mars rover application is available in the src/main folder containing JUnit test cases 
  using the test input given above. Testing requires the installation of the testrunner JUNIT 4 or greater and configuration of the build path.
  • Building the tests using IDE IntelliJ: 
    As described above, but with src/test as root directory.
  • Running the tests using IDE IntellJ: navigate to src/test and the specific test you want to run, 
    then use the 'run as JUnit test' command.

## Built With
 [Maven](https://maven.apache.org/) - Dependency Management

## Contributing & Bug Reporting
Suggestions on design and code improvements are very much appreciated and please report any bugs using my contact details.

## Authors
Ma Kruse - Initial work

## License
This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments
XXX
  
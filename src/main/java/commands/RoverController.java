package commands;

public class RoverController {

    Command command;

    public void setCommands(Command command){
       this.command = command;
    }
    public void runCommands(){
        command.execute();
    }
}

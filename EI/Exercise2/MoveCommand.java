package Exercise2;

public class MoveCommand implements Command {
    @Override
    public void execute(Rover rover) {
        rover.moveForward();
    }
}

package Exercise2;

public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(10, 10, new int[][] { { 2, 2 }, { 3, 5 } });
        Rover rover = new Rover(grid, new Position(0, 0), 'N');

        rover.executeCommand(new MoveCommand());
        rover.executeCommand(new MoveCommand());
        rover.executeCommand(new TurnRightCommand());
        rover.executeCommand(new MoveCommand());
        rover.executeCommand(new TurnLeftCommand());
        rover.executeCommand(new MoveCommand());

        rover.printStatus();
    }
}

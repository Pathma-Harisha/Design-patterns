package Exercise2;

public class Rover {
    private Position position;
    private char direction;
    private final Grid grid;

    public Rover(Grid grid, Position startPosition, char startDirection) {
        this.grid = grid;
        this.position = startPosition;
        this.direction = startDirection;
    }

    public void executeCommand(Command command) {
        command.execute(this);
    }

    public void moveForward() {
        Position newPosition = switch (direction) {
            case 'N' -> new Position(position.getX(), position.getY() + 1);
            case 'E' -> new Position(position.getX() + 1, position.getY());
            case 'S' -> new Position(position.getX(), position.getY() - 1);
            case 'W' -> new Position(position.getX() - 1, position.getY());
            default -> position;
        };

        if (grid.isValidPosition(newPosition)) {
            position = newPosition;
        }
    }

    public void turnLeft() {
        direction = switch (direction) {
            case 'N' -> 'W';
            case 'W' -> 'S';
            case 'S' -> 'E';
            case 'E' -> 'N';
            default -> direction;
        };
    }

    public void turnRight() {
        direction = switch (direction) {
            case 'N' -> 'E';
            case 'E' -> 'S';
            case 'S' -> 'W';
            case 'W' -> 'N';
            default -> direction;
        };
    }

    public void printStatus() {
        System.out.println("Rover is at (" + position.getX() + ", " + position.getY() + ") facing " + direction);
    }
}

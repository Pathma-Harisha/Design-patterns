package Exercise2;

public class Grid {
    private final int width;
    private final int height;
    private final boolean[][] obstacles;

    public Grid(int width, int height, int[][] obstaclePositions) {
        this.width = width;
        this.height = height;
        this.obstacles = new boolean[width][height];

        for (int[] position : obstaclePositions) {
            obstacles[position[0]][position[1]] = true;
        }
    }

    public boolean isValidPosition(Position position) {
        return position.getX() >= 0 && position.getX() < width &&
               position.getY() >= 0 && position.getY() < height &&
               !obstacles[position.getX()][position.getY()];
    }
}

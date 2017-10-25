package alex.heustess;

import java.util.Random;

public class Grid {
    private int[][] grid;

    public Grid() {
        grid = new int[4][4];
        createMappedGrid();
    }

    public void updateGrid() {
        createMappedGrid();
    }

    private void createMappedGrid() {
        int rndEndPosY = new Random().nextInt(grid.length);
        int rndEndPosX = new Random().nextInt(grid[0].length);
        //create mapped grid
        for (int i = 0; i < grid.length; i++) {
            for (int x = 0; x < grid[i].length; x++) {
                grid[i][x] = Math.abs(rndEndPosX - x) + Math.abs(rndEndPosY - i);
            }
        }
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int[] r : grid) {
            for (int c : r) {
                s.append(c).append(" ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}


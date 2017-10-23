package alex.heustess;

import java.util.Random;

class Main {
    public static void main(String[] args) {
        Print printObject = new Print();
        int[][] grid = new int[4][4];

        int rndEndPosY = new Random().nextInt(grid.length);
        int rndEndPosX = new Random().nextInt(grid[0].length); //change to reflect grid[].length

        grid[rndEndPosY][rndEndPosX] = 0;
        System.out.println("Char position: grid[" + rndEndPosY + "][" + rndEndPosX + "]" + " = " + grid[rndEndPosY][rndEndPosX] + "\n");

        //print initial position
        printObject.printGrid(grid);

        //create mapped grid
        for (int i = 0; i < grid.length; i++) {
            for (int x = 0; x < grid[i].length; x++) {
                grid[i][x] = Math.abs(rndEndPosX - x) + Math.abs(rndEndPosY - i);
            }
        }

        //Print mapped grid
        printObject.printGrid(grid);
    }
}


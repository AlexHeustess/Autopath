import java.util.Arrays;
import java.util.Random;
import java.lang.Math.*;

public class Main {
    public static void main(String[] args){
        Print printObject = new Print();
        int[] row1 = {1,1,1,1};
        int[] row2 = {1,1,1,1};
        int[] row3 = {1,1,1,1};
        int[] row4 = {1,1,1,1};
        int[][] grid = {row1, row2, row3, row4};
        int rndEndPosY = new Random().nextInt(grid.length);
        int rndEndPosX = new Random().nextInt(grid[0].length); //change to reflect grid[].length
        int rndCharPosY = new Random().nextInt(grid.length);
        int rndCharPosX = new Random().nextInt(grid[0].length); //change to reflect grid[].length
        grid[rndEndPosY][rndEndPosX] = 0;

        System.out.println("Char position: grid[" + rndEndPosY + "][" + rndEndPosX + "]" + " = " + grid[rndEndPosY][rndEndPosX]);
        System.out.print("\n");

        //print initial position
        printObject.printGrid(grid);

        //create mapped grid
        for(int i = 0; i < grid.length; i++){
            for(int x = 0; x < grid[i].length; x++) {
                    grid[i][x] = Math.abs(rndEndPosX - x) + Math.abs(rndEndPosY - i);
            }
        }

        //Print mapped grid
        printObject.printGrid(grid);


    }
}


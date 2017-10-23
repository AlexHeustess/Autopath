package alex.heustess;

public class Print {
    public void printGrid(int[][] grid){


        //print initial position
        for(int i = 0; i < grid.length; i++){
            for(int x = 0; x < grid[i].length; x++){
                System.out.print(grid[i][x] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}

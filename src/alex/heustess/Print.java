package alex.heustess;

class Print {
    void printGrid(int[][] grid) {

        for (int[] r : grid) {
            for (int c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

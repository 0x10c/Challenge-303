package io.github.theacid.challenge032;

class ArrayGrid {
    public static void main(String[] args) {
        int i, j, n = 10;
        int grid[][] = new int[10][10];

        for(i = 0; i < n; i++) {
            for(j = 0; j < n; j++) {
                System.out.printf("%1dX", grid[i][j]);
            }
            System.out.println();
        }
    }
}

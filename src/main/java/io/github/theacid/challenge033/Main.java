package io.github.theacid.challenge033;

class ArrayGrid {
    public static void main(String[] args) {
        int i, j, n = 10;
        int grid[][] = new int[10][10];

        for(i = 0; i < n; i++) {
            for(j = 0; j < n; j++) {
                if(i == j|| n == j + i + 1) {
                    System.out.printf("%1dX", grid[i][j]);
                }
                else {
                    System.out.print((grid[i][j] = 0));
                }
            }
            System.out.println();
        }
    }
}

package io.github.theacid.challenge010;

class DiagonalNumbers {
    public static void main(String[] args) {
        int matrix[][] = new int[10][10];
        int sum, i, j = 0, n = 10;

        for(i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j)
                    matrix[i][j] = 1 + i;
                else
                    matrix[i][j] = 0;
            }
        }

        for(i = 0; i < n; i++) {
            for(j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
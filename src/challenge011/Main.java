package challenge011;

class DiagonalArray {
    public static void main(String[] args) {
        int matrix[][] = new int[10][10];
        int sum, i, j, n = 10;

        for(i = 0; i < n; i++) {
            for(j = 0; j < n; j++) {
                if(n == j + i + 1)
                    matrix[i][j] = 1;
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

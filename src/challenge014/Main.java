package challenge014;

class TwoColumnsArray {
    public static void main(String[] args) {
        int i, j, n = 10;
        int matrix[][]= new int[n][n];

        for(i = 0; i < n; i++) {
            for(j = 0; j < n; j++) {
                if(j == 0) matrix[i][j] = i;
                if(j == 1) matrix[i][j] = i * i;
                if(j > 1) matrix[i][j] = 0;
            }
        }
        // Printing
        for(i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

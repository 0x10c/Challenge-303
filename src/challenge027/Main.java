package challenge027;

import java.util.Random;

class RandomMatrix {
    private int i, j, matrix;

    private void readValues(double[][] matrix, int size) {
        Random randomValue = new Random();

        for(i = 0; i < size; i++) {
            for(j = 0; j < size; j++) {
                if(i == j) {
                    matrix[i][j] = Math.round(9 * (randomValue.nextDouble()));
                }
                else {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private void calculate(double matrix[][], int size) {
        double sum = 0;

        for(i = 0; i < size; i++)
            sum = sum + matrix[i][i];
        System.out.println("Sum of elements: " + (int) sum + ".");
    }

    private void result(double matrix[][], int size) {
        for(i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                System.out.print((int) matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 10;
        double[][] matrix = new double[size][size];

        RandomMatrix randMatrix = new RandomMatrix();
        randMatrix.readValues(matrix, size);
        randMatrix.calculate(matrix, size);
        randMatrix.result(matrix, size);
    }
}

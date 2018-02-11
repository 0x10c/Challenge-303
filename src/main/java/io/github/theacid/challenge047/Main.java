package io.github.theacid.challenge047;

import java.util.Scanner;

class MatrixGrid {
    private static void matrixGrid(int n, int m) {
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print((int)(Math.random() * 2) + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Horizontal length: ");
        int n = inputValue.nextInt();
        System.out.println("Vertical length: ");
        int m = inputValue.nextInt();


        matrixGrid(n,m);
    }
}

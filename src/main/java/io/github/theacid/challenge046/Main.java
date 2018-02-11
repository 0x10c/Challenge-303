package io.github.theacid.challenge046;

import java.util.Scanner;

class MatrixGrid {
    private static void matrixGrid(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print((int)(Math.random() * 2) + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = inputValue.nextInt();
        matrixGrid(n);
    }
}

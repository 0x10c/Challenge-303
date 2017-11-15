package challenge060;

import java.util.Scanner;

class PascalTriangle {
    private static void print(int n) {
        for(int i = 0; i < n; i++) {
            for(int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) + " ");
            }
            System.out.println();
        }
    }

    private static int pascal(int i, int j) {
        if(j == 0 || j == i) {
            return 1;
        }
        else {
            return pascal(i - 1, j - 1) + pascal(i - 1, j);
        }
    }

    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.print("Number of rows: ");

        int rowsNumber = inputValue.nextInt();
        System.out.println("Pascal triangle: ");
        print(rowsNumber);
    }
}

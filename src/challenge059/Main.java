package challenge059;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Starting number: ");
        int startingNumber = inputValue.nextInt();

        System.out.println("Ending number: ");
        int endingNumber  = inputValue.nextInt();

        int numberRange = startingNumber + ((int)(Math.random() * (endingNumber - startingNumber) + 1));

        System.out.println(numberRange);
    }
}

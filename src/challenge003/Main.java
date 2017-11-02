package challenge003;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

class GuessNumber {
    public static void main(String[] args) throws IOException {
        double generateNumber, guessNumber;
        Scanner inputValues = new Scanner(System.in);

        System.out.println("Generated a number from 0 - 100");
        System.out.println("Enter a value: ");

        Random randomNumber = new Random();
        generateNumber = Math.round(100*(randomNumber.nextDouble()));

        guessNumber = Double.parseDouble(inputValues.nextLine());
        if(guessNumber == generateNumber) {
            System.out.println("Well done!");
        }
        else {
            System.out.println("Sorry! Generated number is: " + (int)generateNumber + " But Try again.");
        }
    }
}
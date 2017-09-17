package challenge003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        double generateNumber, guessNumber;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Generated a number from 0 - 100");
        System.out.println("Enter a value: ");

        Random randomNumber = new Random();
        generateNumber = Math.round(100*(randomNumber.nextDouble()));

        guessNumber = Double.parseDouble(reader.readLine());
        if(guessNumber == generateNumber) {
            System.out.println("Well done!");
        }
        else {
            System.out.println("Sorry! Generated number is: " + (int)generateNumber + " But Try again.");
        }
    }
}
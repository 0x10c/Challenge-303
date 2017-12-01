package io.github.theacid.challenge001;

import java.io.IOException;
import java.util.Scanner;

class ModValue {
    public static void main(String[] args) throws IOException{
        double firstValue, secondValue, result;
        Scanner inputValues = new Scanner(System.in);

        System.out.println("Enter first value: ");
        firstValue = Double.parseDouble(inputValues.nextLine());

        System.out.println("Enter a second value: ");
        secondValue = Double.parseDouble(inputValues.nextLine());

        result = firstValue%secondValue;

        System.out.println("The rest of the division from: " + firstValue + " to " + secondValue + " is: " + result);
    }
}

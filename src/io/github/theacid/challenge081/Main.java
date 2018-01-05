package io.github.theacid.challenge081;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Number: ");
        double startingNumber = inputValue.nextDouble();

        double fract = startingNumber % 1;
        double value = startingNumber - fract;

        System.out.println("Starting value: " + startingNumber);
        System.out.println("Main part: " + value);
        System.out.println("Fractional part: " + fract);
    }
}

package io.github.theacid.challenge082;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Number: ");
        double startingNumber = inputValue.nextDouble();

        if((startingNumber % 1) == 0) {
            System.out.println("Not a double number.");
        }
        else {
            System.out.println("Yes. It's a double number.");
        }
    }
}

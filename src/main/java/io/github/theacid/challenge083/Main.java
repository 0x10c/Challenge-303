package io.github.theacid.challenge083;

import java.math.BigDecimal;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Number: ");
        float startingNumber = inputValue.nextFloat();

        System.out.println("Round to: ");
        int roundTo = inputValue.nextInt();

        BigDecimal value = new BigDecimal(Float.toString(startingNumber));
        value = value.setScale(roundTo, BigDecimal.ROUND_HALF_UP);

        System.out.println("Original value: " + inputValue);
        System.out.println("Rounded value: " + value);
    }
}

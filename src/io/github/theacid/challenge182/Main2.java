package io.github.theacid.challenge182;

import java.util.Scanner;

/* Example for prime numbers value. Quantity taken from input */

public class Main2 {
    private static boolean isPrime(int starting) {
        for(int i = 2; i <= starting/2; i++) {
            if(starting % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int starting = 2;
        int count = 0;
        //int value;
        long allPrimes = 0;

        Scanner inputValue = new Scanner(System.in);

        System.out.println("Type a number: ");
        int value = inputValue.nextInt();

        while(count < value) {
            if(isPrime(starting)) {
                allPrimes += starting;
                count++;
            }
            starting++;
        }
        System.out.println(allPrimes);
    }
}

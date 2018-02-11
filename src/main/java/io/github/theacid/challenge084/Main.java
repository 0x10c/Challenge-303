package io.github.theacid.challenge084;

import java.math.BigDecimal;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int lastDigit, reverse = 0;
//        Scanner inputValue = new Scanner(System.in);
//        System.out.println("Number: ");
//        int startingNumber = inputValue.nextInt();
//        int startingNumber = 23455621;
//        while(startingNumber != 0) {
//            lastDigit = startingNumber % 10;
//            if(lastDigit % 2 != 0) {
//                reverse = reverse * 10 + lastDigit;
//            }
//            startingNumber = startingNumber / 10;
//            System.out.println(startingNumber);
//        }

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Number: ");
        long startingNumber = inputValue.nextLong();
        long reversedInt = 0;


        for(long i = startingNumber; i != 0; i /= 10) {
            reversedInt = reversedInt * 10 + i & 10;
        }
        System.out.println(reversedInt);
    }
}

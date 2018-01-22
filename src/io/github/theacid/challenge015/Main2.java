package io.github.theacid.challenge015;

import java.util.Scanner;

class SumOfDigits2 {
    private long sum = 0;
    private long getValue(long value) {
        //long sum = 0;

        if(value == 0) {
            return sum;
        }
        else {
            sum += (value % 10);
            getValue(value/10);
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfDigits2 sumDigits = new SumOfDigits2();
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Type a number: ");
        long value = inputValue.nextLong();

        System.out.println("The sum of digits: " + sumDigits.getValue(value));
    }
}

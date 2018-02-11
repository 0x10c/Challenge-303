package io.github.theacid.challenge037;

import java.util.Arrays;

class MinMaxValue {
    private static int getMax(int[] someNumbers) {
        int maxValue = someNumbers[0];

        for(int i = 0; i < someNumbers.length; i++) {
            if(someNumbers[i] > maxValue)
                maxValue = someNumbers[i];
        }
        return maxValue;
    }

    private static int getMin(int[] someNumbers) {
        int minValue = someNumbers[0];

        for(int i = 0; i < someNumbers.length; i++) {
            if(someNumbers[i] < minValue) {
                minValue = someNumbers[i];
            }
        }
        return minValue;
    }

    public static void main(String[] args) {
        int someNumbers[] = { 22, 25, 19, 22, 27, 25, 31, 35, 32, 38, 38, 40 };
        System.out.println("Original array: " + Arrays.toString(someNumbers));

        System.out.print("Min value in array: " + getMin(someNumbers) + "\nMax value in array: " + getMax(someNumbers));
    }
}
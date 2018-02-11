package io.github.theacid.challenge251;

import java.util.Random;

public class SortTest {
    private static void printt(int array[]) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Random randomNumbers = new Random();
        // liczby z przedzialu 0 - 100
        int testArrays[] = new int[5];

        for(int i = 0; i < testArrays.length; i++) {
            testArrays[i] = randomNumbers.nextInt(20);
        }

        // Przed sortowaniem
        SortTest.printt(testArrays);

        // Sortowanie
        //BubbleSort.sort(testArrays);
        BubbleSortWithFlag.sort(testArrays);

        // Po sortowaniu
        SortTest.printt(testArrays);
    }
}

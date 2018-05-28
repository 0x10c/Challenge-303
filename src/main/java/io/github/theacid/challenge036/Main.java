package io.github.theacid.challenge036;

public class Main {
    private static int numbers[] = {-5, 3, 8, 10, 15, 18, 19, 21, 22, 25, 27, 31, 35, 38, 40, 42, 44, 50 };

    private static int largestValue() {
        int maxElement = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxElement)
                maxElement = numbers[i];
        }
        return maxElement;
    }

    private static int smallestValue() {
        int minElement = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minElement)
                minElement = numbers[i];
        }
        return minElement;
    }

    public static void main(String[] args) {
        System.out.println("Largest element: " + largestValue());
        System.out.println("Smallest element: " + smallestValue());
    }
}

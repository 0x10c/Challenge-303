package challenge026;

// Get the larger value between first and last element of an array of integers

import java.util.Arrays;

class GetLargestAndSmallestValue1 {
    public static void main(String[] args) {
        int elements[] = { -3, 5, 10, 17, 8, 23, 44, 52 };
        System.out.println("Original array: " + Arrays.toString(elements));

        int smallestElement = Arrays.stream(elements).min().getAsInt();
        int highestElement = Arrays.stream(elements).max().getAsInt();

        System.out.println("Smallest element: " + smallestElement);
        System.out.println("Highest element: " + highestElement);
    }
}

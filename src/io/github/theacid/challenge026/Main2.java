package io.github.theacid.challenge026;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

class GetLargestAndSmallestValue2 {
    public static void main(String[] args) {
        int elements[] = { -3, 5, 10, 17, 8, 23, 44, 52 };
        System.out.println("Original array: " + Arrays.toString(elements));

        IntSummaryStatistics statistics = Arrays.stream(elements).summaryStatistics();
        int smallestElement = statistics.getMin();
        int highestElement = statistics.getMax();

        System.out.println("Smallest element: " + smallestElement);
        System.out.println("Highest element: " + highestElement);
    }
}

package io.github.theacid.challenge036;

class MaxValueArray {
    private static int numbers[] = {-5, 3, 8, 10, 15, 18, 19, 21, 22, 25, 27, 31, 35, 38, 40, 42, 44, 50 };

    private static int LargestValue() {
        int maxElement = numbers[0];
        int i;

        for(i = 0; i < numbers.length; i++)
            if(numbers[i] > maxElement)
                maxElement = numbers[i];
            return maxElement;
    }
    public static void main(String[] args) {
        System.out.println("Largest element: " + LargestValue());
    }
}

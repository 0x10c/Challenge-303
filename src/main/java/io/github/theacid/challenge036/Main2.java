package io.github.theacid.challenge036;

public class Main2 {
    public static void main(String[] args) {

        int numbers[] = {-5, 3, 8, 10, 15, 18, 19, 21, 22, 25, 27, 31, 35, 38, 40, 42, 44, 50};

        int max = numbers[0];
        int min = numbers[0];

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max)
                max = numbers[i];
            else
                min = numbers[i];
        }

        System.out.println("Largest value: " + max);
        System.out.println("Smallest value: " + min);
    }
}

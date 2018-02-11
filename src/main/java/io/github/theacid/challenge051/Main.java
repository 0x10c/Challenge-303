package io.github.theacid.challenge051;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int values[] = {10, 20, 50, 43, 34, 234, 6, 65, 34, 10, 20, 50, 6};
        int index = 0, currentValue, count;
        Arrays.sort(values);

        while(index < values.length) {
            currentValue = values[index];
            count = 0;

            for(; index < values.length && currentValue == values[index];
                index++, count++ );

            System.out.println(currentValue + " occurs: " + count + " times.");
        }

    }
}
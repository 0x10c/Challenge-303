package io.github.theacid.challenge179;

import java.util.ArrayList;
import java.util.List;

class DuplicateValue {
    private int findDuplicate(List<Integer> numbers) {
        int highestNumber = numbers.size() - 1;
        int totalNumbers = getSum(numbers);
        int duplicate = totalNumbers - (highestNumber*(highestNumber+1)/2);

        return duplicate;
    }

    private int getSum(List<Integer> numbers) {
        int sum = 0;
        for(int num : numbers) { sum += num; }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        //for(int i = 0; i < 50; i++)
        for(int i = 1; i < 50; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);
        // add duplicate number to list
        numbers.add(40);
        DuplicateValue duplicateNum = new DuplicateValue();
        System.out.println("Duplicate number: " + duplicateNum.findDuplicate(numbers));
    }
}

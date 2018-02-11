package io.github.theacid.challenge028;

import java.util.Scanner;

class IsValueInArray {
    public static void main(String[] args) {
        int elements[] = {-5, 3, 8, 10, 15, 18, 19, 21, 22, 25, 27, 31, 35, 38, 40, 42, 44, 50};
        boolean value = false;
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Enter value: ");
        int enteredValue = inputValue.nextInt();

        for(int i = 0; i < elements.length; i++) {
            if(enteredValue == elements[i]) {
                value = true;
                System.out.println("Found " + inputValue.toString() + " at index " + i);
                break;
            }
        }
        if(!value) {
            System.out.println("The value isn't in the array");
        }
    }
}

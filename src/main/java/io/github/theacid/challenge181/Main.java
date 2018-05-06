package io.github.theacid.challenge181;

import java.util.Scanner;

class Main {

    private static String reverseString(String value) {
        if(value.isEmpty())
            return value;
        return reverseString(value.substring((1))) + value.charAt(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String value = scanner.nextLine();

        String reversed = reverseString(value);
        System.out.println("Reversed: " + reversed);
    }
}

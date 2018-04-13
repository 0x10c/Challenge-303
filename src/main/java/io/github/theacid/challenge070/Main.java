package io.github.theacid.challenge070;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string (ENTER to finish): ");
        String str1 = input.nextLine();

        System.out.println("Enter second string (ENTER to finish): ");
        String str2 = input.nextLine();

        if(isEmptyOrNull(str1)) {
            System.out.println("First string is null or empty.");
        }
        else {
            System.out.println("First string contains characters.");
        }

        if(isEmptyOrNull(str2)) {
            System.out.println("Second String is null or empty.");
        }
        else {
            System.out.println("Second String contains characters.");
        }
    }

    private static boolean isEmptyOrNull(String str) {
        return str == null || str.isEmpty();
    }
}

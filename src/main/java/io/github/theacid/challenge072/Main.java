package io.github.theacid.challenge072;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string (ENTER to finish): ");
        String str = input.nextLine();

        boolean isNumeric = true;

        try {
            Double numeric = Double.parseDouble(str);
        }
        catch(NumberFormatException exc) {
            isNumeric = false;
        }

        if(isNumeric) {
            System.out.println(str + " is a number");
        }
        else {
            System.out.println(str + " isnt number");
        }
    }
}

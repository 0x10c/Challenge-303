package io.github.theacid.challenge058;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner exampleString = new Scanner(System.in);

        System.out.println("Put string: ");
        String getString = exampleString.nextLine();

        System.out.println(getString.replaceAll("\\s", ""));
    }
}

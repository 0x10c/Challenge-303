package io.github.theacid.challenge184;

class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 11;

        System.out.println("Before: a - " + a + ", b - " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After: a - " + a + ", b - " + b);
    }
}

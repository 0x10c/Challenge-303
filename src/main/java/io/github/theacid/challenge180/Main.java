package io.github.theacid.challenge180;

class Main {
    private int reverse(int value) {
        int reverse = 0;
        while(value != 0) {
            reverse = (reverse*10) + (value%10);
            value = value/10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Main reverseNumber = new Main();
        System.out.println("Value: " + reverseNumber.reverse(1234));
    }
}

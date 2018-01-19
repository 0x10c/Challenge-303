package io.github.theacid.challenge181;

class Main {
    private String reverseString(String value) {
        String reverse = "";
        if(value.length() == 0) {
            return value;
        }
        else {
            reverse += value.charAt(value.length() -1) + reverseString(value.substring(0, value.length() - 1));
            return reverse;
        }
    }

    public static void main(String[] args) {
        Main rev = new Main();
        System.out.println("Reversed String: " + rev.reverseString("marS"));
    }
}

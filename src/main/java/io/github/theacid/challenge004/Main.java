package io.github.theacid.challenge004;

class ThreeLoops {
    public static void main(String[] args) {
        int xFor, yFor;
        int xDoWhile = 0, yDoWhile = 0;
        int xWhile = 0, yWhile = 0;

        System.out.println("Counting y = 9x with for loop.\nResults: ");
        for(xFor = 0; xFor <= 10; xFor++) {
            yFor = 9*xFor;
            System.out.println("x = " + xFor + " y = " + yFor);
        }
        System.out.println();


        System.out.println("Counting y = 9x with do while loop.\nResults: ");
        do {
            yDoWhile = 9*xDoWhile;
            System.out.println("x = " + xDoWhile + " y = " + yDoWhile);
            xDoWhile++;
        } while (xDoWhile <= 10);
        System.out.println();


        System.out.println("Counting y = 9x with while loop.\nResults: ");
        while(xWhile <= 10) {
            yWhile = 9*xWhile;
            System.out.println("x = " + xWhile + " y = " + yWhile);
            xWhile++;
        }

    }
}

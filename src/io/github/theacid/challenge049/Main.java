package io.github.theacid.challenge049;

import java.util.Random;

class RandomNumberGenerator {
    public static void main(String[] args) {
        int counter;
        Random random = new Random();

        for(counter = 1; counter <= 10; counter++) {
            System.out.println(random.nextInt(100));
        }
    }
}

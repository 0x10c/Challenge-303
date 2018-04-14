package io.github.theacid.challenge071;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        long milliseconds = 5494838L;

        long seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds);

        System.out.format("%d Milliseconds = %d minutes\n", milliseconds, minutes);
        System.out.format("%d Milliseconds = %d seconds\n", milliseconds, seconds);

        System.out.println(milliseconds + " milliseconds - " + minutes + " minutes.");
        System.out.println(milliseconds + " milliseconds - " + seconds + " seconds.");
    }
}
